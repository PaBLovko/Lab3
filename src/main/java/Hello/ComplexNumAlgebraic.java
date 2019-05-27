package Hello;

import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class ComplexNumAlgebraic extends AbstractNumber {

    private double re;
    private double im;

    public ComplexNumAlgebraic(double re, double im) {
        super();
        this.re = re;
        this.im = im;
    }

    public ComplexNumAlgebraic(String value) throws MyException{
        try {
            StringTokenizer st = new StringTokenizer (value, "+-i", true);
            if (st.hasMoreTokens()) {
                String sa = st.nextToken().trim();
                if (st.hasMoreTokens()) {
                    if (sa.equals ("+")) sa = st.nextToken().trim();
                    if (sa.equals ("-")) sa = "-" + st.nextToken().trim();
                    if (sa.equals ("i")) throw new IllegalArgumentException (value + " is not a complex number");
                }
                re = Double.parseDouble (sa.replace(',','.'));
                if (st.hasMoreTokens()) {
                    String sb = st.nextToken().trim();
                    if (st.hasMoreTokens()) {
                        if (sb.equals ("+")) sb = st.nextToken().trim();
                        if (sb.equals ("-")) sb = "-" + st.nextToken().trim();
                    }
                    im = Double.parseDouble (sb.replace(',','.'));
                }
                if (st.hasMoreTokens()) {
                    String si = st.nextToken().trim();
                    if (!si.equals ("i"))
                        throw new IllegalArgumentException
                                (value + " is not a complex number");
                    if (st.hasMoreTokens())
                        throw new IllegalArgumentException
                                (value + " is not a complex number");
                } else
                    throw new IllegalArgumentException
                            (value + " is not a complex number");
            } else
                throw new IllegalArgumentException (value + " is not a complex number");
        }catch (IllegalArgumentException e) {throw new MyException(e.getMessage(),ErrorCode.NotComplexNumber);}
    }

    public double getRe() { return re; }

    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
        return toCartesianForm();
    }

    public String toCartesianForm() {
        DecimalFormat df = new DecimalFormat("##0.00");
        String real = df.format(getRe()).replace(',','.');
        String imaginaries = df.format(getIm()).replace(',','.');
        String sign = getIm() < 0 ? "" : "+";
        return real + sign + imaginaries + "i";
    }

    public double getArgument() throws MyException{
        try {
            if(im == 0 && re == 0) throw new IllegalArgumentException ("Forbidden combination");
            return Math.atan(im / re);
        }catch (IllegalArgumentException e) {throw new MyException(e.getMessage(), ErrorCode.NotComplexNumber);}
    }

    public double getModule() {
        return Math.sqrt(re * re + im * im);
    }

    public String toExponencialForm() throws MyException{
        DecimalFormat df = new DecimalFormat("##0.00");
        String module = df.format(getModule()).replace(',','.');
        String argument = df.format(getArgument()).replace(',','.');
        return module + "e^" + argument + "i";
    }
}