package johny.javaalgorithms.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinearSearchTest {
    @Test
    public void linearSearchTest() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(1, new LinearSearch().doLinearSerach(array, 2));
    }

    @Test
    public void linearSearchElementNotFoundTest() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(-1, new LinearSearch().doLinearSerach(array, 11));
    }

    @Test
    public void linearSearchWithEmptyArrayTest() {
        int[] array = new int[0];
        assertEquals(-1, new LinearSearch().doLinearSerach(array, 11));
    }

    @Test
    public void linearSearchWithNullArrayTest() {
        assertEquals(-1, new LinearSearch().doLinearSerach(null, 11));
    }

}
