package johny.javaalgorithms.algorithms;

public class QuickSort {

    /**
     * does quicksort on the array passed as the input
     *
     * @param array - the array to be sorted
     * @param left  - the left index from which the sorting is to be done
     * @param right - the right index to which the sorting will be done
     */
    public void quickSort(int[] array, int left, int right) {
        /*left index will be less than the right index if sorting has to be done otherwise sorting cannot be done*/
        if (left >= right) {
            return;
        }
        /*we will choose the middle element as the pivot*/
        int pivot = array[(left + right) / 2];

        /*
         * calling the partition method which will rearrange the array based on the pivot.
         * It returns the partitionIndex based on which the array will be divided into 2 and quicksort will be done on both the arrays
         */
        int partitionIndex = partition(array, left, right, pivot);
        /*
         * calling the quicksort recursively.
         * This will do the same steps in the left array till partitionIndex - 1
         */
        quickSort(array, left, partitionIndex - 1);
        /*
         * calling the quicksort recursively.
         * This will do the same steps in the right array from partitionIndex
         */
        quickSort(array, partitionIndex, right);
    }

    /**
     * This method is the core of the quicksort
     * This method will find the partition index based on which the array will be partitioned and quicksort will be done again recursively
     * @param array - the array which has to be partitioned
     * @param left - partitioning will be done from this index
     * @param right - partitioning will be done till this index
     * @param pivot - the pivot value will decide the movement of the left and the right index
     * @return will return the partitioning index
     */
    private int partition(int[] array, int left, int right, int pivot) {
        /* nothing to be done if left is less than right */
        while (left < right) {
            /* increment the left till there is an element which is greater than the pivot */
            while (array[left] < pivot) {
                left++;
            }
            /* decrement the right till there is an element which is less than the pivot */
            while (array[right] > pivot) {
                right--;
            }
            /* check if left is less than right if the left and right has not crossed and it is stuck */
            if (left <= right) {
                /* swap the left with the right element */
                swap(array, left, right);
                /* move both left and right */
                left++;
                right--;
            }
        }
        /* the partitionIndex will be the left index */
        return left;
    }

    /**
     * This method will swap 2 elements in an array passed
     * @param array - the array in which the swapping has to be done
     * @param left - the index which need to be swapped
     * @param right - the second index which needs to be swapped
     */
    private void swap(int[] array, int left, int right) {
        /* swapping the values using a temp */
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
