package Hello;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class ExpressionTest {
    private static Logger log = Logger.getLogger(ExpressionTest.class.getName());

    @Test
    public void process() throws MyException{
        final Expression Buf1 = new Expression(new Number("2+6i"),new Number("1+3i"),'+');
        final Expression Buf2 = new Expression(new Number("2+6i"),new Number("1+3i"),'-');
        final Expression Buf3 = new Expression(new Number("2+6i"),new Number("1+3i"),'*');
        final Expression Buf4 = new Expression(new Number("2+6i"),new Number("1+3i"),'/');

        assertEquals("3.00+9.00i",Buf1.process(false));
        assertEquals("1.00+3.00i",Buf2.process(false));
        assertEquals("-16.00+12.00i",Buf3.process(false));
        assertEquals("2.00+0.00i",Buf4.process(false));
        assertEquals("9.49e^1.25i",Buf1.process(true));
        assertEquals("3.16e^1.25i",Buf2.process(true));
        assertEquals("20.00e^-0.64i",Buf3.process(true));
        assertEquals("2.00e^0.00i",Buf4.process(true));
    }
}