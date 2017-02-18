package johny.javaalgorithms.algorithms;

/**
 * class to implement linear search
 */
public class LinearSearch {

    /**
     * do linear search and return the index of the element
     * if present in the array else return -1
     *
     * @param array   - the array in which the elemnt has to be searched
     * @param element - the element to be searched
     * @return - the index of the element in the array
     */
    public int doLinearSerach(int[] array, int element) {

        /*
        * If array is null or empty the element wont be present
        * so return -1
        */
        if(array == null || array.length == 0) {
            return -1;
        }
        /* loop till we find the element or till the end of the array */
        for (int i = 0; i < array.length; i++) {
            /* Check if the i th index is equal to the element.
             * If it is equal we have found the element.
             */
            if (array[i] == element) {
                /* the element if found so return the index */
                return i;
            }
        }
        /*
         * If element if found then then the loop will return the index.
         * So we have not found the element in the array so return -1
         */
        return -1;
    }
}
