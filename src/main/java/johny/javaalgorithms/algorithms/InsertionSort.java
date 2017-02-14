package johny.javaalgorithms.algorithms;

/**
 * Class to do insertion sort on a given array
 */
public class InsertionSort {

    /**
     * method will sort the given array in descending order
     *
     * @param array - the array to be sorted
     */
    public void doInsertionSort(int[] array) {

        /* iterate till the end of the array */
        for (int i = 0; i < array.length - 1; i++) {
            /*
             * Take the element in the index i + 1 and place it in the sorted array.
             * The sorted array will be the elements till i.
             */
            for (int j = i + 1; j > 0; j--) {
                /* check if the element at index j is less than the element at index j - 1 */
                if (array[j] < array[j - 1]) {
                    /* swapping the elements till the correct position of i + 1 is reached */
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                } else {
                    /* the element will be in its correct position in the sorted array so break the inner loop */
                    break;
                }
            }
        }
    }
}
