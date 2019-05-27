package Hello;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class AbstractNumberTest {
    private static Logger log = Logger.getLogger(ExpressionTest.class.getName());

    @Test
    public void add(){
        try {
            final ComplexNumAlgebraic firstCompNum = new ComplexNumAlgebraic("1+3i");
            final ComplexNumAlgebraic secondCompNum = new ComplexNumAlgebraic("1+4i");
            assertEquals("2.00+7.00i", ComplexNumAlgebraic.add(firstCompNum,secondCompNum,false));
            assertEquals("7.28e^1.29i", ComplexNumAlgebraic.add(firstCompNum,secondCompNum,true));
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void dif(){
        try {
            final ComplexNumAlgebraic firstCompNum = new ComplexNumAlgebraic("1+3i");
            final ComplexNumAlgebraic secondCompNum = new ComplexNumAlgebraic("1+4i");
            assertEquals("0.00-1.00i", ComplexNumAlgebraic.dif(firstCompNum,secondCompNum,false));
            assertEquals("1.00e^-1.57i", ComplexNumAlgebraic.dif(firstCompNum,secondCompNum,true));
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void mul(){
        try {
            final ComplexNumAlgebraic firstCompNum = new ComplexNumAlgebraic("1+3i");
            final ComplexNumAlgebraic secondCompNum = new ComplexNumAlgebraic("1+4i");
            assertEquals("-11.00+7.00i", ComplexNumAlgebraic.mul(firstCompNum,secondCompNum,false));
            assertEquals("13.04e^-0.57i", ComplexNumAlgebraic.mul(firstCompNum,secondCompNum,true));
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }

    @Test
    public void div(){
        try {
            final ComplexNumAlgebraic firstCompNum = new ComplexNumAlgebraic("1+3i");
            final ComplexNumAlgebraic secondCompNum = new ComplexNumAlgebraic("1+4i");
            assertEquals("0.76-0.06i", ComplexNumAlgebraic.div(firstCompNum,secondCompNum,false));
            assertEquals("0.77e^-0.08i", ComplexNumAlgebraic.div(firstCompNum,secondCompNum,true));
        }catch (MyException e) {log.log(Level.SEVERE, "Exception: ", e);}
    }
}