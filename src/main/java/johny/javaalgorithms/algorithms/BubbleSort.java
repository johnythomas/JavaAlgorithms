package johny.javaalgorithms.algorithms;

/**
 * class to do bubble sort on a given array
 */
public class BubbleSort {

    /**
     * method to sort an array using bubble sort
     *
     * @param array - the array to be sorted
     */
    public void doBubbleSort(int[] array) {
        /* iterate till the end of the array */
        for (int i = 0; i < array.length - 1; i++) {
            /*
             * after each iteration will bring the biggest element of the array to the right of the array
             * this loop will be doing the swapping to bring the largest elements to the right of array
             * after each iteration elements after array lengh - i - 1 will be in sorted order
             */
            for (int j = 0; j < array.length - i - 1; j++) {
                /* finding the largest among the adjacent elements */
                if (array[j] > array[j + 1]) {
                    /* if left element is greater than the right then we swap */
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
