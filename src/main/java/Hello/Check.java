package Hello;

import java.util.regex.Pattern;

public class Check {
    public static boolean containsComplex(String str) throws MyException{
        str = str.trim();
        if(getCartesian(str) || getExponencial(str)){
            return true;
        }
        throw new MyException("No complex in string",ErrorCode.NotComplexNumber);
    }

    public static boolean getCartesian(String str) {
        Pattern cartesianFirst = Pattern.compile("\\d+\\.\\d+[+-](i\\*?\\d+\\.\\d+|\\d+\\.\\d+\\*?i)");// . .
        Pattern cartesianSecond = Pattern.compile("\\d+[+-](i\\*?\\d+\\.\\d+|\\d+\\.\\d+\\*?i)");// _ .
        Pattern cartesianThird = Pattern.compile("\\d+[+-](i\\*?\\d+|\\d+\\*?i)"); // _ _
        Pattern cartesianFourth = Pattern.compile("\\d+\\.\\d+[+-](i\\*?\\d+|\\d+\\*?i)");// . _
        if (cartesianFirst.matcher(str).find() || cartesianSecond.matcher(str).find() || cartesianThird.matcher(str).find() || cartesianFourth.matcher(str).find()) return true;
        else return false;
    }

    public static boolean getExponencial(String str) {
        Pattern exponencialFirst = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+\\.\\d+|\\d+\\.\\d+\\*?i\\)?)");// . .
        Pattern exponencialSecond = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+\\.\\d+|\\d+\\.\\d+\\*?i\\)?)");// _ .
        Pattern exponencialThird = Pattern.compile("(\\d+)?\\*?e\\^\\(?(i\\*\\d+|\\d+\\*?i\\)?)");// _ _
        Pattern exponencialFourth = Pattern.compile("(\\d+\\.\\d+)?\\*?e\\^\\(?(i\\*\\d+|\\d+\\*?i\\)?)");// . _
        if (exponencialFirst.matcher(str).find() || exponencialSecond.matcher(str).find() || exponencialThird.matcher(str).find() || exponencialFourth.matcher(str).find()) return true;
        else return false;
    }

    public static String containsComplexString(String str) {
        str = str.trim();
        if(getCartesian(str)) return "CARTESIAN";
        else return "EXPONENCIAL";
    }
}
