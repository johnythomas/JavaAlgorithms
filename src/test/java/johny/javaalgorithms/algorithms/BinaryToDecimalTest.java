package johny.javaalgorithms.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryToDecimalTest {

    @Test
    public void testConvertBinaryToDecimal() {
        int binary = 101;
        BinaryToDecimal b = new BinaryToDecimal();
        int decimal = b.convertBinaryToDecimal(binary);
        assertEquals(5, decimal);
    }
}
