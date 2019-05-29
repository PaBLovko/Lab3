package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumAlgebraicTest {

    @Test
    public void toCartesianForm() throws MyException{
        assertEquals("12.00-65.30i",new ComplexNumAlgebraic("12.00-65.30i").toCartesianForm());
    }

    @Test
    public void toExponencialForm() throws MyException{
        assertEquals("66.39e^-1.39i",new ComplexNumAlgebraic("12.00-65.30i").toExponencialForm());
    }

    @Test
    public void getArgument() throws MyException{
        assertEquals(-1.38,new ComplexNumAlgebraic("12.00-65.30i").getArgument(), 1);
    }

    @Test
    public void getModule() throws MyException{
        assertEquals(66.39,new ComplexNumAlgebraic("12.00-65.30i").getModule(), 1);
    }
}