package arrays.attempts;

import java.util.Arrays;

public class Stage4 {
	/**
	 * from GeeksForGeeks.com
	 * return an array (say prod) such that for all i, 
	 * prod[i] is equal to the product of all the elements
	 * of data except data[i]. 
	 * 
	 * IMPORTANT!!! Solve it without division operator and in O(n).
	 * 
	 * Example :
	 * if data = {10, 3, 5, 6, 2}
	 * then prod = {180, 600, 360, 300, 900}
	 * @param data
	 * @return array based on above specs
	 */
	public static int[] productAllButOne(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return length of the longest collection of consecutive items (in terms of value, not order)
	 * For example, 
	 * if data = {0, 10, 3, -2, 5, 2, 1, 12, -1}, the longest 
	 * collection of consecutive values is -2, -1, 0, 1, 2, 3 (6 items in total).
	 * so return 6.
	 */
	public static int getLongestConsecutiveLength(int[] data) {
		if (data==null)
			return 0;
		if (data.length <=1)
			return 1;
		int startIndex = 0;
		int endIndex = 0;
		int bestStartIndex = 0;
		int bestEndIndex = 0;
		int consecutiveLength = 0;
		int longestConsecutiveLength = -9999;
		data = new int[]{0, 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 5};
		for (int i=1; i<data.length; i++) {
			if (data[i] > data[i-1]) {
				consecutiveLength++;
			}
			else {
				endIndex = i;
				if (consecutiveLength > longestConsecutiveLength) {
					bestStartIndex = startIndex;
					bestEndIndex = endIndex-1;
					longestConsecutiveLength = consecutiveLength;
				}				
				consecutiveLength = 0;
				startIndex = i;				
			}
		}
		return longestConsecutiveLength; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the longest sequence in ascending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 70, 20, 50, 50, 80}, return {20, 50, 50, 80}
	 * if data = {70, 70, 20, 10, 80, 20}, return {70, 70}
	 * if data = {50, 40, 30, 30}, return {30}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public static int[] getLongestAscendingSequence(int[] data) {
		if (data==null || data.length==0)
			return new int[0];
		if (data.length <=1)
			return data;
		int startIndex = 0;
		int endIndex = 0;
		int bestStartIndex = 0;
		int bestEndIndex = 0;
		int consecutiveLength = 0;
		int longestConsecutiveLength = -9999;
		for (int i=1; i<data.length; i++) {
			if (data[i] >= data[i-1]) {
				consecutiveLength++;
				if (i==data.length-1) {
					endIndex = i;
					if (consecutiveLength > longestConsecutiveLength) {
						bestStartIndex = startIndex;
						bestEndIndex = endIndex;
						longestConsecutiveLength = consecutiveLength;
					}	
				}
			}
			else {
				endIndex = i;
				if (consecutiveLength > longestConsecutiveLength) {
					bestStartIndex = startIndex;
					bestEndIndex = endIndex-1;
					longestConsecutiveLength = consecutiveLength;
				}				
				consecutiveLength = 0;
				startIndex = i;				
			}
		}
		int[] longestSequence = new int[bestEndIndex-bestStartIndex+1];
		for (int i = 0; i<longestSequence.length;i++) {
			longestSequence[i] = data[bestStartIndex + i];
		}
		return longestSequence;
	}

	/**
	 * 
	 * @param data
	 * @return the longest sequence in descending order.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 70, 50, 20, 10, 50, 50, 80}, return {70, 50, 20, 10}
	 * if data = {70, 70, 90, 10, 90, 80}, return {70, 70}
	 * if data = {50, 40, 30, 30}, return {50, 40, 30, 30}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public static int[] getLongestDescendingSequence(int[] data) {
		return new int[0]; //to be completed
	}


	/**
	 * 
	 * @param data
	 * @return the longest sequence of the same item.
	 * return the sequence that occurs first in case of a tie.
	 * for example, 
	 * if data = {10, 30, 30, 30, 30, 50, 50, 80}, return {30, 30, 30, 30}
	 * if data = {70, 70, 90, 90, 80, 80}, return {70, 70}
	 * if data = {50, 40, 30, 20}, return {50}
	 * if data = null, return null
	 * if data = {}, return {}
	 */
	public static int[] getLongestUnchangedSequence(int[] data) {
		if (data==null || data.length==0)
			return new int[0];
		if (data.length <=1)
			return data;
		int startIndex = 0;
		int endIndex = 0;
		int bestStartIndex = 0;
		int bestEndIndex = 0;
		int consecutiveLength = 0;
		int longestConsecutiveLength = -9999;
		for (int i=1; i<data.length; i++) {
			if (data[i] == data[i-1]) {
				consecutiveLength++;
				if (i==data.length-1) {
					endIndex = i;
					if (consecutiveLength > longestConsecutiveLength) {
						bestStartIndex = startIndex;
						bestEndIndex = endIndex;
						longestConsecutiveLength = consecutiveLength;
					}	
				}
			}
			else {
				endIndex = i;
				if (consecutiveLength > longestConsecutiveLength) {
					bestStartIndex = startIndex;
					bestEndIndex = endIndex-1;
					longestConsecutiveLength = consecutiveLength;
				}				
				consecutiveLength = 0;
				startIndex = i;				
			}
		}
		int[] longestSequence = new int[bestEndIndex-bestStartIndex+1];
		for (int i = 0; i<longestSequence.length;i++) {
			longestSequence[i] = data[bestStartIndex + i];
		}
		return longestSequence;
	}

	/**
	 * 
	 * @param data
	 * sort the array in ascending order,
	 * do nothing if the array is null or has fewer than 2 items
	 */
	public static void sortAsc(int[] data) {
		if (data==null || data.length < 2)
			return;
		for (int i =0; i<data.length-1;i++) {
			for (int j = 0; j <data.length - 1 - i; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		//bubble sort works by moving the largest item to the end
		// watch mosh vid on bubble sort in plain english
	}

	/**
	 * 
	 * @param data
	 * sort the array in descending order,
	 * do nothing if the array is null or has fewer than 2 items
	 */
	public static void sortDesc(int[] data) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * @param asc
	 * sort the array in ascending order if asc is true,
	 * otherwise sort the array in descending order
	 */
	public static void sort(int[] data, boolean asc) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * @param asc
	 * if the array is already sorted (either ascending or descending), do nothing regardless of asc,
	 * otherwise sort the array in ascending order if asc is true,
	 * otherwise sort the array in descending order
	 */
	public static void sortIfNeeded(int[] data, boolean asc) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * if the array is in ascending order, sort it in descending order
	 * if the array is in descending order, sort it in ascending order
	 * do nothing if the array is unsorted
	 */
	public static void reverseSort(int[] data) {
		//to be completed
	}


	/**
	 * 
	 * @param a: sorted in ascending order
	 * @param b: sorted in ascending order
	 * @return an array containing the common items from a and b.
	 * If array a contains p occurrences of an item and array b contains q occurrences of the same item, 
	 * the array returned must have Math.min(p, q) occurrences of that item.
	 */
	public static int[] getCommonItemsSorted(int[] a, int[] b) {
		int[] commonItems = new int[Math.min(a.length, b.length)];
	    int commonIndex = 0;

	    int i = 0; // pointer for array a
	    int j = 0; // pointer for array b

	    while (i < a.length && j < b.length) {
	        if (a[i] == b[j]) {
	            commonItems[commonIndex] = a[i];
	            commonIndex++;
	            i++;
	            j++;
	        } else if (a[i] < b[j]) {
	            i++;
	        } else {
	            j++;
	        }
	    }

	    // Trim the commonItems array to remove unused elements
	    return Arrays.copyOf(commonItems, commonIndex);
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return an array containing the common items from a and b.
	 * If array a contains p occurrences of an item and array b contains q occurrences of the same item, 
	 * the array returned must have Math.min(p, q) occurrences of that item.
	 * 
	 * All occurrences of an item in the resulting array should be together, and be in the order of first appearance in array a.
	 * See the last junit test sample for details 
	 */
	public static int[] getCommonItemsUnsorted(int[] a, int[] b) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there are no common items between any two subarrays of the array passed, false otherwise.
	 */
	public static boolean noCommonItems(int[][] data) {
		return false; //to be completed
	}

	/**
	 * @param data
	 * @return the longest sequence of items that occurs
	 * in the mirrored (back to front) form as well.
	 * in case of a tie, return the sequence that occurs first.
	 * Examples:
	 * if data = {10, 20, 30, 40, 50, 20, 10, 40, 30, 20, 50, 40}
	 * return the array {20, 30, 40} (not {40, 30, 20})
	 *
	 * if data = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the array {1,2,1,2,1,2,1,2,1,2,1}
	 * if data = {5,6,7,8,9}
	 * return the array {5}
	 * if data = {5,6,7,5,7,6,8,5,6,9}
	 * return the array {6,7}
	 */
	public static int[] getLongestMirroredSequence(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * in math, a "set" is defined as a collection of **distinct** items.
	 * Thus, {1,7,2,9} is a set, but {1,7,2,1,9} is not (since 1 occurs multiple times).
	 * @param data
	 * @return a "set" obtained from the passed array. the order of the items should be 
	 * the order in of the first occurrences of the items in the passed array.
	 * for example,
	 * if data = {1,7,2,1,9,7,9,9}, return {1,7,2,9}
	 * if data = {7,2,1,1,9,7,9,9}, return {7,2,1,9}
	 */
	public static int[] getSet(int[] data) {
		return new int[0]; //to be completed
	}
}
