package exercise1.test;

import exercise1.task.Exercise1;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Test
    public void testIter() throws Exception {
        Method method = Exercise1.class.getDeclaredMethod("sum", int.class);
        assertEquals(true, method.getReturnType().equals(Integer.TYPE));
        method.setAccessible(true);
        assertEquals(45, method.invoke(null, 9));
        assertEquals(55, method.invoke(null, 10));
        assertEquals(1, method.invoke(null, 1));
        assertEquals(0, method.invoke(null, 0));
        assertEquals(-1, method.invoke(null, 0));
        assertEquals(-100, method.invoke(null, 0));
        assertEquals(100, method.invoke(null, 5050));

    }

}
