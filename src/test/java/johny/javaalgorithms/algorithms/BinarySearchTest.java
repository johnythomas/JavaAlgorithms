package johny.javaalgorithms.algorithms;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void binarySearchWithComparableTest() {
        Integer array[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1, BinarySearch.binarySearchRecurssive(array, 0, 9, 2));
    }

    @Test
    public void binarySearchWithComparableTestForFailure() {
        Integer array[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1, BinarySearch.binarySearchRecurssive(array, 0, 9, 11));
    }

    @Test
    public void binarySearchWithComperatorTest() {
        Integer array[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(1,
                BinarySearch.binarySearchRecurssive(array, 0, 9, 2, Comparator.naturalOrder()));
    }

    @Test
    public void binarySearchWithComperatorTestForFailure() {
        Integer array[] = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1,
                BinarySearch.binarySearchRecurssive(array, 0, 9, -1, Comparator.naturalOrder()));
    }
}
