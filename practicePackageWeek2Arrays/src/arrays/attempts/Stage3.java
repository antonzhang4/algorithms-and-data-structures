package arrays.attempts;

import java.util.Arrays;
import ServiceClasses.*;

public class Stage3 {
	/**
	 * 
	 * @param n
	 * @param init
	 * @param inc
	 * @return an array containing n items such that the first item is init, 
	 * and each item is inc more than the previous item.
	 * return null if n is less than 0
	 * 
	 * NOTE 1: take special care when n equals 0, the method should return the array {}
	 * NOTE 2: inc can be negative too :)
	 */
	public static int[] generatePatternedArray(int n, int init, int inc) {
		if (n<0) {
			return null;
		} else if (n==0) {
			return new int[0];
		}
		int[] myArr = new int[n];
		for (int i=0; i<n; i++) {
			myArr[i] = init;
			init += inc;
		}
		return myArr; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return number of items that exist exactly once in the array passed
	 * 
	 */
	public static int countUniqueItems(int[] data) {
		if (data==null || data.length == 0) {
			return 0;
		} else if (data.length == 1) {
			return 1;
		}
		int count = 0;
		for (int i = 0; i<data.length; i++) {
			for (int j = 0; j<data.length; j++) {
				if (data[i] == data[j] && i!=j) {
					count--;
					break;
				} 
			}
			count++;
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items in the same order,
	 * false otherwise 
	 * return false if either of array passed is null
	 */
	public static boolean identical(int[] a, int[] b) {
		if (a== null || b==null || a.length != b.length) {
			return false;
		}
		for (int i =0; i<a.length; i++) {
			if (a[i]!=b[i]) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a contains all the items in b,
	 * false otherwise
	 * return false if either of array passed is null
	 */
	public static boolean contains(int[] a, int[] b) {
		if (a== null || b==null) {
			return false;
		}
		boolean contains = false;
		for (int i = 0; i<b.length; i++) {
			contains = false;
			for (int j=0; j<a.length; j++) {
				if (a[j]==b[i]) {
					contains = true;
					break;
				}
			}
			if (contains == false) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b have the same items but not necessarily in the same order,
	 * false otherwise 
	 * return false if either of array passed is null
	 */
	public static boolean same(int[] a, int[] b) {
		if (a== null || b==null || a.length == 0 || b.length == 0 || a.length != b.length) {
			return false;
		}
		boolean contains = false;
		for (int i = 0; i<b.length; i++) {
			contains = false;
			for (int j=0; j<a.length; j++) {
				if (a[j]==b[i]) {
					contains = true;
					break;
				}
			}
			if (contains == false) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return true if a and b are mutually reserve, false otherwise
	 * return null if either of the array passed is null
	 */
	public static boolean mutuallyReverse(int[] a, int[] b) {
		if (a== null || b==null || a.length == 0 || b.length == 0 || a.length != b.length) {
			return false;
		}
		for (int i = 0; i<a.length; i++) {
			if(a[i] != b[b.length-1-i]) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return a new array where all items of a
	 * are followed by all items of b,
	 * return null if either of the array passed is null
	 */
	public static int[] merge(int[] a, int[] b) {
		if (a== null || b==null) {
			return null;
		}
		int[] newArr = new int[a.length+b.length];
		for (int i =0; i<newArr.length; i++) {
			if (i<a.length) {
				newArr[i] = a[i];
			}
			else newArr[i] = b[i-a.length];
			
		}
		return newArr; //to be completed
	}

	/**
	 * 
	 * @param n
	 * @return an array containing items {1, 2, ..., n-1, n}
	 * return null if n is less than 0
	 */
	public static int[] generate(int n) {
		if (n<0) {
			return null;
		}
		int[] newArr = new int[n];
		for(int i =0; i<newArr.length;i++) {
			newArr[i] = i+1;
		}
		return newArr; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the reverse of data,
	 * return null if array passed is null,
	 * return empty array if array passed is empty
	 */
	public static int[] getReverse(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears most in the array,
	 * or the first item that does so in case of a tie
	 * You may assume that array passed is NOT null
	 */
	public static int getMostFrequentItem(int[] data) {
		int index = 0;
		int maxfrequency = 0;
		for (int i=0; i<data.length; i++) {
			int freq = 0;
			for (int j = 0; j<data.length; j++) {
				if (data[i] == data[j]) {
					freq++;
				}
			}
			if (freq > maxfrequency) {
				maxfrequency = freq;
				index = i;
			}
		}
		return data[index]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the item that appears least in the array,
	 * or the first item that does so in case of a tie.
	 * You may assume that array passed is NOT null
	 */
	public static int getLeastFrequentItem(int[] data) {
		int index = 0;
		int minfrequency = 99999;
		for (int i=0; i<data.length; i++) {
			int freq = 0;
			for (int j = 0; j<data.length; j++) {
				if (data[i] == data[j]) {
					freq++;
				}
			}
			if (freq < minfrequency) {
				minfrequency = freq;
				index = i;
			}
		}
		return data[index]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing the numbers of occurrences of all distinct items in data
	 * return null if the array is null.
	 */
	public static int[] getFrequencyTable(int[] data) {
		if (data == null) {
			return null;
		}
		int[] d = new int[data.length];
		int size = 0;
		int count = 0;
		for (int i = 0; i<data.length;i ++) {
			count = 0;
			for (int j = 0; j<data.length; j++) {
				if(data[i] == data[j] && i>j) {
					break;
				}
				else if (data[i] == data[j]) {
					count++;
				}
			}
			if (count != 0) {
				d[i] = count;
				size++;
			}
		}	
		int[] distinct = new int[size];
		for (int k=0; k<distinct.length;k++) {
			distinct[k] = d[k];
		}
		return distinct; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param start
	 * @return a subarray of data from index start (inclusive) to the end of the array,
	 * return null if array is null or empty or start is invalid
	 */
	public static int[] subarrayFromIndex(int[] data, int start) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param end
	 * @return a subarray of data from the start of the array to index end (inclusive),
	 * return null if array is null or empty or end is invalid
	 */
	public static int[] subarrayUptoIndex(int[] data, int end) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return a subarray of data from index start to index end (inclusive),
	 * return null if 
	 *  - array is null or empty, or, 
	 *  - start and/or end is invalid, or,
	 *  - start is more than end
	 */
	public static int[] subarray(int[] data, int start, int end) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getPositives(int[] data) {
		if (data == null) {
			return null;
		} else if (data.length==0) {
			return new int[0];
		}
		int count = 0;

	    // Count the number of positive elements
	    for (int number : data) {
	        if (number > 0) {
	            count++;
	        }
	    }

	    // Create a new array to store the positive elements
	    int[] positiveArray = new int[count];
	    int index = 0;

	    // Populate the positiveArray with positive elements
	    for (int number : data) {
	        if (number > 0) {
	            positiveArray[index] = number;
	            index++;
	        }
	    }

	    return positiveArray;
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNegatives(int[] data) {
		if (data == null) {
			return null;
		} else if (data.length==0) {
			return new int[0];
		}
		
		int count = 0;
		for (int i =0; i<data.length; i++) {
			if(data[i]<0) {
				count++;
			}
		}
		int index = 0;
		int[] negatives = new int[count];
		for (int i =0; i<data.length; i++) {
			if(data[i]<0) {
				negatives[index] = data[i];
				index++;
			}
		}
		return negatives; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-zero items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getNonZeroes(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all items of data that are prime numbers,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: Use isPrime from MathService class as:
	 * MathService.isPrime(number to check)
	 */
	public static int[] getPrimes(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-negative items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutNegatives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return an array containing all non-positive items of data,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getWithoutPositives(int[] data) {
		return new int[0]; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return a new array where only unique items are included,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 */
	public static int[] getUniqueItems(int[] data) {
		if (data == null) {
			return null;
		} else if (data.length==0) {
			return new int[0];
		}
		int count = 0;
		boolean match = false;
		for (int i=0; i<data.length; i++) {
			match = false;
			for(int j=0; j<data.length;j++) {
				if (data[i] == data[j] && i!=j) {
					match = true;
					break;
				}
			}
			if (match==false)
				count++;
		}
		int index = 0;
		int[] unique = new int[count];
		for (int i=0; i<data.length; i++) {
			match = false;
			for(int j=0; j<data.length;j++) {
				if (data[i] == data[j] && i!=j) {
					match = true;
					break;
				}
			}
			if (match==false) {
				unique[index] = data[i];
				index++;
			}
		}
		return unique; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return a deep copy of the array passed as parameter,
	 * return null if array passed is null,
	 * return an empty array if array passed is empty
	 * 
	 * TIP: you can use getCopy(int[]) from Stage2
	 */
	public static int[][] getDeepCopy(int[][] data) {
		if (data == null) {
	        return null;
	    } else if (data.length == 0 || data[0].length == 0) {
	        return new int[0][0];
	    }

	    int[][] deepCopy = new int[data.length][];
	    for (int i = 0; i < data.length; i++) {
	        deepCopy[i] = new int[data[i].length];
	        for (int j = 0; j < data[i].length; j++) {
	            deepCopy[i][j] = data[i][j];
	        }
	    }

	    return deepCopy;
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the first index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int indexOf(int[] data, int[] sub) {
		if (sub.length > data.length || data==null ||sub == null || data.length == 0 || sub.length == 0) {
			return -1;
		}
		for (int i =0; i<data.length; i++) {
			if (data[i] == sub[0]) {
				return i;
			}
		}
		return -1; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param sub
	 * @return the last index at which sub starts in data
	 * return -1 if sub has a higher length than data or there is no such sub found in data
	 */
	public static int lastIndexOf(int[] data, int[] sub) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfItems(int[][] data) {
		if (data==null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i =0; i<data.length; i++) {
			if (data[i]==null)
				continue;
			for(int j=0; j<data[i].length; j++) {
				count++;			
			}
		}
		return count;
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of even items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfEvenItems(int[][] data) {
		if (data==null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i =0; i<data.length; i++) {
			if (data[i]==null)
				continue;
			for(int j=0; j<data[i].length; j++) {
				if (data[i][j] %2==0) {
					count++;	
				}
						
			}
		}
		return count;
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of odd items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfOddItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of positive items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfPositiveItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of negative items in non-null subarrays of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfNegativeItems(int[][] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the total number of unique items in each non-null subarray of data,
	 * return 0 if data is null or empty
	 */
	public static int totalNumberOfUniqueItems(int[][] data) {
		if (data==null || data.length == 0) {
			return 0;
		}
		int count = 0;
		boolean match = false;
		for (int i =0; i<data.length; i++) {
			if (data[i]==null)
				continue;
			for(int j=0; j<data[i].length; j++) {
				match=false;
				for(int k=0; k<data[i].length; k++) {
					if(data[i][j]==data[i][k] && j!=k) {
						match = true;
						break;
					}
				}
				if(match==false) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNullSubarrays(int[][] data) {
		if (data==null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i =0; i<data.length; i++) {
			if (data[i]==null) {
				count++;
				continue;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param data: an array of arrays
	 * @return the number of non-null subarrays in data,
	 * return 0 if data is null or empty
	 */
	public static int countNonNullSubarrays(int[][] data) {
		return 0; //to be completed
	}
}
