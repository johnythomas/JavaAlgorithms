package johny.javaalgorithms.algorithms;

public class MergeSort {

    /**
     * do merge sort on the array
     *
     * @param array - the array to be sorted
     * @throws NullPointerException if null array is passed
     */
    public static void doMergeSort(int[] array) {
        ms(array, 0, array.length - 1);
    }

    /**
     * method to do merge sort using divide and conquer
     *
     * @param array - the array to be sorted
     * @param left  - the left index of the array
     * @param right - the right index of the array
     */
    private static void ms(int[] array, int left, int right) {
        // end the recursion if left if greater than right
        if (left >= right) {
            return;
        }
        // finding the middle element in the array
        int middle = (left + right) / 2;
        // calling the ms recursively which divides the array
        ms(array, left, middle);
        ms(array, middle + 1, right);
        // merging the array in sorted order
        merge(array, left, middle, right);
    }

    /**
     * Does merge on the sorted sub arrays
     *
     * @param array  - the array to be sorted
     * @param left   - the left index of the sub array
     * @param middle - the end index left array and the starting index of the right array
     * @param right  - the end right index of the right array
     */
    private static void merge(int[] array, int left, int middle, int right) {

        // creating the temp array to do the merge operation
        int[] leftArray = new int[middle - left + 1];
        int[] rightArray = new int[right - middle];

        // copying the elements from array to the temp arrays
        System.arraycopy(array, left, leftArray, 0, leftArray.length);
        System.arraycopy(array, middle + 1, rightArray, 0, rightArray.length);

        // creating the index of each of the arrays for iteration
        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int mergedArrayIndex = left;

        // merging the arrays in sorted order
        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                array[mergedArrayIndex] = leftArray[leftArrayIndex++];
            } else {
                array[mergedArrayIndex] = rightArray[rightArrayIndex++];
            }
            mergedArrayIndex++;
        }

        // copying the remaining elements in the leftArray
        while (leftArrayIndex < leftArray.length) {
            array[mergedArrayIndex++] = leftArray[leftArrayIndex++];
        }
        // copying the remaining elements in the rightArray
        while (rightArrayIndex < rightArray.length) {
            array[mergedArrayIndex++] = rightArray[rightArrayIndex++];
        }
    }
}
