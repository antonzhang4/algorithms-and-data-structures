package arrays.attempts;

public class Stage1 {
	/**
	 * 
	 * @param data
	 * @return true if array is null, false otherwise
	 */
	public static boolean isNull(int[] data) {
		if (data == null) {
			return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if array passed is empty (or null), false otherwise
	 */
	public static boolean isEmpty(int[] data) {
		if(data == null)
			return true;
		if(data.length == 0)
			return true;
		return false;
	}

	/**
	 * 
	 * @param data
	 * @return 0 if array is null or empty, 
	 * otherwise return the index of the last item
	 */
	public static int getLastItemIndex(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		return data.length-1; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return 0 if array is null or empty, 
	 * otherwise return the last item
	 */
	public static int getLastItem(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		return data[data.length-1]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return 0 if array is null or contains less than two items, 
	 * otherwise return the second last item
	 */
	public static int getSecondLastItem(int[] data) {
		if (data == null || data.length < 2) {
			return 0;
		}
		return data[data.length-2]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return false if array passed is null or has less than two items,
	 * otherwise 
	 * return true if the second last item is less than the last item,
	 * otherwise return false
	 */
	public static boolean secondLastLessThanLast(int[] data) {
		if (data == null || data.length < 2) {
			return false;
		}
		return data[data.length-2] < data[data.length-1]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item in the "middle" of the array.
	 * when the array has an even number of items, you should
	 * return the item to the right of the "splitting line"
	 */
	public static int getMedian(int[] data) {
		if (data == null || data.length==0) {
			return 0;
		}
		if (data.length == 1) {
			return data[0];
		}
		return data[data.length/2];
	}

	/**
	 * 
	 * @param data
	 * @return 0 if the array passed is null or has less than two items,
	 * otherwise return the sum of the first and the last items 
	 */
	public static int getSumFirstLastItems(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param idx
	 * @return true if an item exists in the passed array at the passed index,
	 * false otherwise
	 */
	public static boolean itemExistsAt(int[] data, int idx) {
		if (data == null || data.length ==0) {
			return false;
		}
		if (idx >=0 && idx < data.length) {
			return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param idx
	 * @return 
	 * if an item exists in the passed array at the passed index, return that item,
	 * return 0 otherwise
	 */
	public static int get(int[] data, int idx) {
		if (data == null || data.length == 0) {
			return 0;
		}
		if (idx >= 0 && idx < data.length) {
			return data[idx];
		}
		return 0;
	}

	/**
	 * 
	 * @param n
	 * @return if n is less than zero, return null
	 * otherwise return an array of size n
	 */
	public static int[] generate(int n) {
		if (n<0) {
			return null;
		}
		return new int[n]; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if the two arrays have the same number of items.
	 * return false if either is null
	 */
	public static boolean sameSize(int[] a, int[] b) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @param idx
	 * @return true if both arrays passed have the same item at the passed index,
	 * return false is all other scenarios
	 */
	public static boolean sameItemAt(int[] a, int[] b, int idx) {
		if (a==null || b ==null || a.length == 0 || b.length==0) {
			return false;
		}
		if(idx >=0 && idx < a.length && idx < b.length) {
			if (a[idx] == b[idx]) {
				return true;
			}
		}
		return false; //to be completed
	}
}
