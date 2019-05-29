package Hello;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class ComplexNumExponentialTest {
    private static Logger log = Logger.getLogger(ExpressionTest.class.getName());

    @Test
    public void toCartesianForm() throws MyException{
        assertEquals("0.51+1.20i",new ComplexNumExponential("1.3e^64i").toCartesianForm());
    }
}