package johny.javaalgorithms.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {

    @Test
    public void testGCD() {
        assertEquals(1, GCD.findGCD(1, 2));
        assertEquals(5, GCD.findGCD(5, 10));
        assertEquals(6, GCD.findGCD(54, 24));

    }
}
