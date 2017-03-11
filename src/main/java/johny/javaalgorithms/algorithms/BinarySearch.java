package johny.javaalgorithms.algorithms;

import java.util.Comparator;

/**
 * Class to perform binary search on an array of elements
 * 
 * @author johny
 *
 */
public class BinarySearch {

	/**
	 * Does binary search on the array input and will return the index of the
	 * value that is searched if it is present else will return -1
	 * 
	 * @param array
	 *            - the array in which search has to be done
	 * @param startIndex
	 *            - the search will start from this index in the array
	 * @param endIndex
	 *            - the search will be done till this index in the array
	 * @param searchValue
	 *            - the value to search in the array
	 * @param comparator
	 *            - used for comparing the elements in the array
	 * @return - index of the searchValue in the array if present else return -1
	 */
	public static <T> int binarySearchRecurssive(T array[], int startIndex, int endIndex, T searchValue,
			Comparator<T> comparator) {
		/*
		 * While doing the search recursively if the searchValue is not present
		 * in the array then startIndex will become more than the endIndex at
		 * sometime. When that happens then we return -1 which means element is
		 * not present.
		 */
		if (startIndex > endIndex) {
			return -1;
		}

		/* find the middle index of the array to split the array into 2 */
		int middleIndex = (startIndex + endIndex) / 2;

		/* check if the middle element is same as the searchValue */
		if (comparator.compare(searchValue, array[middleIndex]) == 0) {
			/*
			 * returning the index of the searchValue in the array ie.
			 * middleIndex
			 */
			return middleIndex;
		}

		/*
		 * check if the middle element in the array is smaller than the search
		 * value
		 */
		if (comparator.compare(array[middleIndex], searchValue) <= -1) {
			/*
			 * When middle element is smaller than the search value then the
			 * searchValue will be only be present in some index which is
			 * greater than middleIndex. So we have to recursively search for
			 * the searchValue in the index greater than middleIndex.
			 */
			return binarySearchRecurssive(array, middleIndex + 1, endIndex, searchValue, comparator);
		} else {
			/*
			 * When middle element is greater than the search value then the
			 * searchValue will be only be present in some index which is less
			 * than middleIndex. So we have to recursively search for the
			 * searchValue in the index less than middleIndex.
			 */
			return binarySearchRecurssive(array, startIndex, middleIndex - 1, searchValue, comparator);
		}
	}

	/**
	 * does binary search on the array input and will return the index of the
	 * value that is searched if it is present else will return -1. This method
	 * is not taking the {@link Comparator} as the argument instead it relies on
	 * the {@link Comparable} interface. The type of the array should have
	 * implemented the {@link Comparable} interface.
	 * 
	 * @param array
	 *            - the array in which search has to be done. It should
	 *            implement {@link Comparable} interface
	 * @param startIndex
	 *            - the search will start from this index in the array
	 * @param endIndex
	 *            - the search will be done till this index in the array
	 * @param searchValue
	 *            - the value to search in the array
	 * @return - index of the searchValue in the array if present else return -1
	 */
	public static <T extends Comparable<T>> int binarySearchRecurssive(T array[], int startIndex, int endIndex,
			T searchValue) {

		/*
		 * internally calling the binarySearchRecurssive(T[], int , int, T,
		 * Comparator<T>) method by passing the comparator
		 */
		return binarySearchRecurssive(array, startIndex, endIndex, searchValue, Comparator.naturalOrder());
	}
}
