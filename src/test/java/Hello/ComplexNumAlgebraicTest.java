package Hello;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class ComplexNumAlgebraicTest {
    private static Logger log = Logger.getLogger(ExpressionTest.class.getName());

    @Test
    public void toCartesianForm(){
        try {
            assertEquals("12.00-65.30i",new ComplexNumAlgebraic("12.00-65.30i").toCartesianForm());
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void toExponencialForm(){
        try {
            assertEquals("66.39e^-1.39i",new ComplexNumAlgebraic("12.00-65.30i").toExponencialForm());
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void getArgument(){
        try {
            assertEquals(-1.38,new ComplexNumAlgebraic("12.00-65.30i").getArgument(), 1);
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void getModule(){
        try {
            assertEquals(66.39,new ComplexNumAlgebraic("12.00-65.30i").getModule(), 1);
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }
}