package johny.javaalgorithms.datastructures;

import johny.javaalgorithms.algorithms.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class QickSortTest {

    @Test
    public void quicksortTest1() {

        int arr[] = new int[]{4, 3, 5, 2, 1, 3, 2, 3};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);
        int sortedArr[] = new int[]{1, 2, 2, 3, 3, 3, 4, 5};
        Stream.of(arr).forEach(ele -> System.out.print(ele + "\t"));
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }

    @Test
    public void quicksortTest() {
        int arr[] = new int[]{4, 3, 5, 2, 1, 3, 2, 3};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);
        int sortedArr[] = new int[]{1, 2, 2, 3, 3, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }

    @Test
    public void quicksortTestForEmptyArray() {
        int arr[] = new int[]{};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);
    }

    @Test
    public void quicksortTestForAllElementsSameArray() {

        int arr[] = new int[]{1, 1, 1, 1, 1};
        QuickSort q = new QuickSort();
        q.quickSort(arr, 0, arr.length - 1);
        int sortedArr[] = new int[]{1, 1, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            Assert.assertEquals(sortedArr[i], arr[i]);
        }
    }
}
