package Hello;

public class AbstractNumber extends Number {

    public static String add(ComplexNumAlgebraic comNumFirst, ComplexNumAlgebraic comNumSecond, boolean switchedOn) throws MyException{
        if(!switchedOn)
            return new ComplexNumAlgebraic(comNumFirst.getRe() + comNumSecond.getRe(), comNumFirst.getIm() + comNumSecond.getIm()).toString();
        else return new ComplexNumAlgebraic(comNumFirst.getRe() + comNumSecond.getRe(), comNumFirst.getIm() + comNumSecond.getIm()).toExponencialForm();
    }

    public static String dif(ComplexNumAlgebraic comNumFirst, ComplexNumAlgebraic comNumSecond, boolean switchedOn) throws MyException{
        if(!switchedOn)
            return new ComplexNumAlgebraic(comNumFirst.getRe() - comNumSecond.getRe(), comNumFirst.getIm() - comNumSecond.getIm()).toString();
        else return new ComplexNumAlgebraic(comNumFirst.getRe() - comNumSecond.getRe(), comNumFirst.getIm() - comNumSecond.getIm()).toExponencialForm();
    }

    public static String mul(ComplexNumAlgebraic comNumFirst, ComplexNumAlgebraic comNumSecond, boolean switchedOn) throws MyException{
        if(!switchedOn)
            return new ComplexNumAlgebraic(comNumFirst.getRe() * comNumSecond.getRe() - comNumFirst.getIm() * comNumSecond.getIm(),
                    comNumFirst.getRe() * comNumSecond.getIm() + comNumFirst.getIm() * comNumSecond.getRe()).toString();
        else return new ComplexNumAlgebraic(comNumFirst.getRe() * comNumSecond.getRe() - comNumFirst.getIm() * comNumSecond.getIm(),
                comNumFirst.getRe() * comNumSecond.getIm() + comNumFirst.getIm() * comNumSecond.getRe()).toExponencialForm();
    }

    public static String div(ComplexNumAlgebraic comNumFirst, ComplexNumAlgebraic comNumSecond, boolean switchedOn) throws MyException{
        double firstRe = comNumFirst.getRe();
        double secondRe = comNumSecond.getRe();
        double firstIm = comNumFirst.getIm();
        double secondIm = comNumSecond.getIm();
        double sum = StrictMath.pow(secondRe, 2.) + StrictMath.pow(secondIm, 2.);
        if(!switchedOn)
            return new ComplexNumAlgebraic((firstRe * secondRe + firstIm * secondIm) / sum, (secondRe * firstIm - firstRe * secondIm) / sum).toString();
        else return new ComplexNumAlgebraic((firstRe * secondRe + firstIm * secondIm) / sum, (secondRe * firstIm - firstRe * secondIm) / sum).toExponencialForm();
    }
}