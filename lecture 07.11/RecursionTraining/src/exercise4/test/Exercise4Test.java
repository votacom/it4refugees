package exercise4.test;

import exercise4.task.Exercise4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;


public class Exercise4Test {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void testIter() throws Exception {
        Method method = Exercise4.class.getDeclaredMethod("drawDots", int.class);
        assertEquals(true, method.getReturnType().equals(String.class));
        method.setAccessible(true);
        assertEquals("4....", method.invoke(null, 4));
        assertEquals("....", method.invoke(null, -4));
        assertEquals("3...", method.invoke(null, 3));
        assertEquals("...", method.invoke(null, -3));
        assertEquals("10..........", method.invoke(null, 10));
        assertEquals("..........", method.invoke(null, -10));
        assertEquals("", method.invoke(null, 0));
        assertEquals("1.", method.invoke(null, 1));
        assertEquals(".", method.invoke(null, -1));
    }

}
