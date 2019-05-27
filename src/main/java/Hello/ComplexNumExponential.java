package Hello;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class ComplexNumExponential extends AbstractNumber {
    private double module;
    private double phase;

    public ComplexNumExponential(double module, double phase) {
        super();
        this.module = module;
        this.phase = phase;
    }

    public double getModule() { return module; }

    public double getPhase() { return phase; }

    public ComplexNumExponential(String value) throws MyException{
        try{
            StringTokenizer st = new StringTokenizer (value, "+-e^i", true);
            if (st.hasMoreTokens()) {
                String sa = st.nextToken().trim();
                if (st.hasMoreTokens()) {
                    if (sa.equals ("+")) sa = st.nextToken().trim();
                    if (sa.equals ("-")) sa = "-" + st.nextToken().trim();
                    if (sa.equals ("i")) throw new IllegalArgumentException (value + " is not a complex number");
                }
                module = Double.parseDouble (sa.replace(',','.'));
                if (st.hasMoreTokens()) {
                    String sb = st.nextToken().trim();
                    if (sb.equals("e")) sb = st.nextToken().trim();
                    else throw new IllegalArgumentException (value + " is not a complex number");
                    if (sb.equals("^")) sb = st.nextToken().trim();
                    else throw new IllegalArgumentException (value + " is not a complex number");
                    if (st.hasMoreTokens()) {
                        if (sb.equals ("+")) sb = st.nextToken().trim();
                        if (sb.equals ("-")) sb = "-" + st.nextToken().trim();
                    }
                    phase = Double.parseDouble (sb.replace(',','.'));
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

    public String toCartesianForm() {
        DecimalFormat df = new DecimalFormat("##0.00");
        String re = df.format(module*Math.cos(phase)).replace(',','.');
        String im = df.format(module*Math.sin(phase)).replace(',','.');
        String sign = (module*Math.sin(phase)) < 0 ? "" : "+";
        return re + sign + im + "i";
    }
}