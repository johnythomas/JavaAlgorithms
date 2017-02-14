package johny.javaalgorithms.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testDoBubbleSort() {
        int arr[] = new int[]{4, 3, 5, 2, 1, 3, 2, 3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(arr);
        int sortedArr[] = new int[]{1, 2, 2, 3, 3, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }

    @Test
    public void insertionSortTestForEmptyArray() {
        int arr[] = new int[]{};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(arr);
    }

    @Test
    public void insertionSortTestForAllElementsSameArray() {
        int arr[] = new int[]{1, 1, 1, 1, 1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort(arr);
        int sortedArr[] = new int[]{1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }
}
