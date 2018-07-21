package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public static void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array1 = new String[5];
		for (int i = 0; i < array1.length; i++) {
			array1[i] =  i + "";
		}
		assertEquals(3, _00_LinearSearch.linearSearch(array1, 3 + ""));
		assertEquals(4, _00_LinearSearch.linearSearch(array1, 4 + ""));
		assertEquals(2, _00_LinearSearch.linearSearch(array1, 2 + ""));
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array2 = new int[5];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i;
		}
		assertEquals(3, _01_BinarySearch.binarySearch(array2, 0, array2.length, 3));
		assertEquals(4, _01_BinarySearch.binarySearch(array2, 0, array2.length, 4));
		assertEquals(2, _01_BinarySearch.binarySearch(array2, 0, array2.length, 2));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
