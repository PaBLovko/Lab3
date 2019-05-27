package Hello;

public class Expression {
    private Number[] array = new Number[2];
    private char operation;

    public Expression (Number z1, Number z2, char symbol) {
        array[0] = z1;
        array[1] = z2;
        operation = symbol;
    }

    public String process(boolean switchedOn) throws MyException{
        ComplexNumAlgebraic z1;
        ComplexNumAlgebraic z2;
         if(Check.containsComplexString(array[0].getValue()).equals("EXPONENCIAL"))
             z1 = new ComplexNumAlgebraic(new ComplexNumExponential(array[0].getValue()).toCartesianForm());
         else z1 = new ComplexNumAlgebraic(array[0].getValue());
         if(Check.containsComplexString(array[1].getValue()).equals("EXPONENCIAL"))
             z2 = new ComplexNumAlgebraic(new ComplexNumExponential(array[1].getValue()).toCartesianForm());
         else z2 = new ComplexNumAlgebraic(array[1].getValue());
        if (operation == '+')
                 return AbstractNumber.add(z1,z2, switchedOn);
             if (operation == '-')
                 return AbstractNumber.dif(z1,z2, switchedOn);
             if (operation == '*')
                 return AbstractNumber.mul(z1,z2, switchedOn);
             else
                 return AbstractNumber.div(z1,z2, switchedOn);
    }
}