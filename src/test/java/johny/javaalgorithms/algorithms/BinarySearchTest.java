package johny.javaalgorithms.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

import johny.javaalgorithms.algorithms.BinarySearch;

import java.util.Comparator;

public class BinarySearchTest {

	@Test
	public void binarySearchWithComparableTest() {
		Integer array[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(1, BinarySearch.binarySearchRecurssive(array, 0, 9, 2));
	}

	@Test
	public void binarySearchWithComparableTestForFailure() {
		Integer array[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(-1, BinarySearch.binarySearchRecurssive(array, 0, 9, 11));
	}

	@Test
	public void binarySearchWithComperatorTest() {
		Integer array[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(1,
				BinarySearch.binarySearchRecurssive(array, 0, 9, 2, Comparator.naturalOrder()));
	}

	@Test
	public void binarySearchWithComperatorTestForFailure() {
		Integer array[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertEquals(-1,
				BinarySearch.binarySearchRecurssive(array, 0, 9, -1, Comparator.naturalOrder()));
	}
}
