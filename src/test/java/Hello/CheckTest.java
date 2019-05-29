package Hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckTest {

    @Test(expected = MyException.class)
    public void containsComplex() throws MyException{
        Check.containsComplex("Error");
    }

    @Test
    public void getCartesian() {
        assertTrue( Check.getCartesian("1.1+32.3i") &&  Check.getCartesian("1+32.3i") &&
                Check.getCartesian("1+32i") &&  Check.getCartesian("1.1+32i"));
    }

    @Test
    public void getExponencial() {
        assertTrue(Check.getExponencial("1.1e^32.3i")&& Check.getExponencial("1e^32.3i") &&
                Check.getExponencial("1e^32i") && Check.getExponencial("1.1e^32i"));
    }

    @Test
    public void containsComplexString() {
        assertEquals("CARTESIAN", Check.containsComplexString("1+32.3i"));
        assertEquals("EXPONENCIAL", Check.containsComplexString("1e^32.3i"));
    }
}