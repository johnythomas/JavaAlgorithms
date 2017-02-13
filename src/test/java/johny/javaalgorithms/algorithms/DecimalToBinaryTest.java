package johny.javaalgorithms.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecimalToBinaryTest {

    @Test
    public void convertDecimalToBinaryTest() {

        DecimalToBinary d = new DecimalToBinary();
        String binary = d.convertDecimalToBinary(7);
        assertEquals("111", binary);
    }
}
