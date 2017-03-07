package johny.javaalgorithms.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortTest {

    @Test
    public void sortedArrayTest() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] sortedArray = new int[]{1, 2, 3, 4, 5};
        MergeSort.doMergeSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals("invalid sorted array", sortedArray[i], array[i]);
        }
    }

    @Test
    public void arrayInDescendingOrderTest() {
        int[] array = new int[]{5, 4, 3, 2, 1, 0};
        int[] sortedArray = new int[]{0, 1, 2, 3, 4, 5};
        MergeSort.doMergeSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals("invalid sorted array", sortedArray[i], array[i]);
        }
    }

    @Test
    public void someRandomArrayTest() {
        int[] array = new int[]{4, 2, 3, 1, 5, 0};
        int[] sortedArray = new int[]{0, 1, 2, 3, 4, 5};
        MergeSort.doMergeSort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals("invalid sorted array", sortedArray[i], array[i]);
        }
    }

    @Test
    public void emptyArrayTest() {
        int[] array = new int[0];
        MergeSort.doMergeSort(array);
        assertEquals(0, array.length);
    }

    @Test(expected = NullPointerException.class)
    public void nullArrayTest() {
        int[] array = null;
        MergeSort.doMergeSort(array);
    }
}
