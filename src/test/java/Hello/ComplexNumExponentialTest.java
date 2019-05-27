package Hello;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class ComplexNumExponentialTest {
    private static Logger log = Logger.getLogger(ExpressionTest.class.getName());

    @Test
    public void toCartesianForm() {
        try {
            assertEquals("0.51+1.20i",new ComplexNumExponential("1.3e^64i").toCartesianForm());
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }
}