package arrays.attempts;


public class Stage2 {
	/**
	 * 
	 * @param data
	 * @return the sum of all items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sum(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i =0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all even items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumEven(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				sum += data[i];
			}
		}
		return sum; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @return the sum of all odd items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumOdd(int[] data) {
		return 0; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @return the sum of all positive (more than 0) items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumPositives(int[] data) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @return the sum of all negative (less than 0) items of the array passed.
	 * return 0 if the array is null
	 */
	public static int sumNegatives(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the sum of all items of the array passed that are multiples of n.
	 * return 0 if the array is null
	 */
	public static int sumMultiples(int[] data, int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the sum of all items of the array passed of which n is a multiple.
	 * return 0 if the array is null
	 */
	public static int sumFactors(int[] data, int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return sum of all items of the array passed that lie in the number range [low...high]
	 */
	public static int sumInRange(int[] data, int low, int high) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return sum of all items of the array passed that lie OUTSIDE the number range [low...high]
	 */
	public static int sumNotInRange(int[] data, int low, int high) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @return the sum of all items at even indices of the array passed
	 */
	public static int sumEvenIndexedItems(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the sum of all items at odd indices of the array passed
	 */
	public static int sumOddIndexedItems(int[] data) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * reset any negative value(s) in the array passed to zero.
	 */
	public static void resetNegatives(int[] data) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * update any negative value(s) in the array passed to positive value.
	 * for example, if data[2] is -5, it should become 5.
	 */
	public static void makeAbsolute(int[] data) {
		//to be completed
	}

	/**
	 * 
	 * @param data
	 * update each item of the array to the square of itself.
	 */
	public static void squareUp(int[] data) {
		if (data == null || data.length == 0 ) {
			return;
		}
		for (int i = 0; i<data.length; i++) {
			data[i] = data[i] * data[i];
		}
	}

	/**
	 * 
	 * @param data
	 * @return the number of even numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countEven(int[] data) {
		return 0; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @return the number of odd numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countOdd(int[] data) {
		return 0; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @return the number of positive (more than 0) numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countPositives(int[] data) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @return the number of negative (less than 0) numbers in the array passed.
	 * return 0 if the array is null.
	 */
	public static int countNegatives(int[] data) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the number of items in the array passed that are multiples of n.
	 * return 0 if the array is null.
	 */
	public static int countMultiples(int[] data, int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param n
	 * @return the number of items in the array passed of which n is a multiple.
	 * return 0 if the array is null.
	 */
	public static int countFactors(int[] data, int n) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return number of items in the array passed that are in the number range [low...high].
	 * return 0 if the array is null.
	 */
	public static int countInRange(int[] data, int low, int high) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @param low
	 * @param high
	 * @return number of items in the array passed that are OUTSIDE the number range [low...high].
	 * return 0 if the array is null.
	 */
	public static int countNotInRange(int[] data, int low, int high) {
		return 0; //to be completed
	} 	

	/**
	 * 
	 * @param data
	 * @param target
	 * @return number of times target exists in the array passed.
	 * return 0 if array is null.
	 */
	public static int countOccurrences(int[] data, int target) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i =0; i<data.length;i++) {
			if (data[i] == target) {
				count++;
			}
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the number of items in the array passed that occur exactly once in the array.
	 * return 0 if array is null.
	 * HINT: use countOccurrences(int[], int)
	 */
	public static int countUnique(int[] data) {
		if (data==null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i=0; i<data.length; i++) {
			if (countOccurrences(data, data[i]) == 1) {
				count++;
			}
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @return true if target exists in array passed, false otherwise.
	 * return false if array is null.
	 */
	public static boolean contains(int[] data, int target) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @return the first index at which target exists in the array passed.
	 * return -1 if array is null or target doesn't exist in the array.
	 */
	public static int indexOf(int[] data, int target) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @return the LAST index at which target exists in the array passed.
	 * return -1 if array is null or target doesn't exist in the array.
	 */
	public static int lastIndexOf(int[] data, int target) {
		if (data==null || data.length == 0) {
			return -1;
		}
		int index = 0;
		for (int i = data.length-1; i>=0; i--) {
			if (data[i] == target) {
				index = i;
				return index;
			}
		}
		return -1; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @return true if target exists at index startIndex or later in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array starting at index startIndex.
	 */
	public static boolean containsFromIndex(int[] data, int target, int startIndex) {
		if (data == null || data.length == 0 || startIndex < 0 || startIndex >= data.length) {
			return false;
		}
		for (int i = startIndex; i<data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param endIndex
	 * @return true if target exists up to index endIndex at which target exists in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array up to index startIndex.
	 */
	public static boolean containsUptoIndex(int[] data, int target, int endIndex) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return true if target exists in the index range [startIndex...endIndex] at which target exists in the array passed, false otherwise.
	 * return false if array is null or target doesn't exist in the array in the index range [startIndex...endIndex].

	 */
	public static boolean containsBetweenIndices(int[] data, int target, int startIndex, int endIndex) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @return sum of all items at index startIndex or higher in the array passed.
	 * return 0 if array is null.
	 */
	public static int sumFromIndex(int[] data, int startIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return sum of all items at index endIndex or lower in the array passed.
	 * return 0 if array is null.
	 */
	public static int sumUptoIndex(int[] data, int endIndex) {
		return 0; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @param endIndex
	 * @return sum of all items in the index range [startIndex...endIndex].
	 * return 0 if array is null.
	 */
	public static int sumBetweenIndices(int[] data, int startIndex, int endIndex) {
		return 0; //to be completed
	} 

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @return sum of all even numbers at index startIndex or later.
	 * return 0 if array is null.
	 */
	public static int sumEvenFromIndex(int[] data, int startIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return sum of all odd numbers up to, and including, endIndex.
	 * return 0 if array is null.
	 */
	public static int sumOddUptoIndex(int[] data, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param endIndex
	 * @return product of all positive items up to index endIndex.
	 * return 1 if array is null or if no positive items exist up to index endIndex.
	 */
	public static int productPositivesUptoIndex(int[] data, int endIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @return product of all negative items starting at index startIndex.
	 * return 1 if array is null or if no negative items exist starting at index startIndex.
	 */
	public static int productNegativesFromIndex(int[] data, int startIndex) {
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param key
	 * @param startIndex
	 * @param endIndex
	 * @return number of times key exists in the array between the indices startIndex and endIndex.
	 * return 0 if array is null or if key doesn't exist between indices startIndex and endIndex. 
	 */
	public static int countOccurrencesBetweenIndices(int[] data, int key, int startIndex, int endIndex) {
		if (data == null || data.length == 0 || startIndex < 0 || startIndex >= data.length || endIndex < 0 || endIndex >= data.length) {
			return 0;
		}
		int count = 0;
		for (int i = startIndex; i<=endIndex; i++) {
			if (data[i] == key) {
				count ++;
			}
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @param startIndex
	 * @param endIndex
	 * @return number of items that exist exactly once in the array between the indices startIndex and endIndex.
	 * return 0 if array is null or none of the items exist exactly once between indices startIndex and endIndex.
	 * HINT: use countOccurrencesBetweenIndices(int[], int, int, int)
	 */
	public static int countUniqueBetweenIndices(int[] data, int startIndex, int endIndex) {
		if (data == null || data.length == 0 || startIndex < 0 || startIndex >= data.length || endIndex < 0 || endIndex >= data.length) {
			return 0;
		}
		int count = 0;
		for (int i= startIndex; i<=endIndex; i++) {
			if(countOccurrencesBetweenIndices(data, data[i], startIndex, endIndex) == 1) {
				count ++;
			}
		}
		return count; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are positive (more than 0), false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allPositives(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are negative (less than 0), false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allNegatives(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are zero, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allZeroes(int[] data) {
		return false; //to be completed
	}


	/**
	 * 
	 * @param data
	 * @return true if all items of the array are non-zero, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean allNonZeroes(int[] data) {
		return false; //to be completed
	}


	/**
	 * 
	 * @param data
	 * @return true if all items of the array are prime, false otherwise.
	 * You can use the method isPrime from class MathService.
	 * To check if an integer (val) is prime, use the expression MathService.isPrime(val) == true
	 * return false if the array is null.
	 */
	public static boolean allPrimes(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one positive (more than 0) value in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsPositive(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one negative (less than 0) value in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNegative(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one zero in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsZero(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one non-zero in the array, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean containsNonZero(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if there exists at least one prime number in the array passed, false otherwise.
	 * You can use the method isPrime from class MathService.
	 * To check if an integer (val) is prime, use the expression MathService.isPrime(val) == true
	 * return false if the array is null.
	 */
	public static boolean containsPrime(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if the array is in ascending order, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isAscending(int[] data) {
		if (data == null) {
			return false;
		}
		for (int i = 0; i<data.length-1; i++) {
			if (data[i] > data[i+1]) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if the array is in descending order, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isDescending(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if all items of the array are the same, false otherwise.
	 * return false if the array is null.
	 */
	public static boolean isUnchanged(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return 2 if the array is sorted in both ascending and descending order,
	 * otherwise 1 if the array is sorted in ascending order,
	 * otherwise -1 if array is sorted in descending order, 
	 * otherwise 0
	 * return 0 if array is null.
	 * 
	 * NOTE: an array like {5, 5, 5} is sorted in both ascending AND descending order
	 */
	public static int getSortedOrder(int[] data) {
		if (data == null) {
			return 0;
		}
		boolean isAscending = true;
		boolean isDescending = true;
		boolean both = true;
		for (int i =0; i <data.length-1; i++) {
			if (data[i] == data[i+1]) {
				continue;
			} else if (data[i] > data[i + 1]) {
				both = false;
				isAscending = false;
			} else {
				both = false;
				isDescending = false;
			}
		}
		if (both == true) {
			return 2;
		} else if (isAscending) {
			return 1;
		} else if (isDescending) {
			return -1;
		}
		return 0; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if the array contains the same number of positive (more than 0) and negative (less than 0) items.
	 * return false if array is null.
	 */
	public static boolean isBalanced(int[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if each data[i] of the array is a valid digit ('0' to '9'), false otherwise.
	 * return false if array is null.
	 */
	public static boolean allDigits(char[] data) {
		if (data == null)
			return false;
		for (int i =0; i<data.length; i ++) {
			if (!(data[i] >= '0' && data[i] <= '9')) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if at least 1 item of the array is a valid digit ('0' to '9'), false otherwise.
	 * return false if array is null.
	 */
	public static boolean containsDigit(char[] data) {
		return false; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the characters of the array converted to a String.
	 * return null if the array is null.
	 */
	public static String toString(char[] data) {
		return ""; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return a copy of the array.
	 * NOTE: the array returned SHOULD NOT refer to the same collection
	 * that the array passed refers to. 
	 * In other words
	 * if you update the values in the array returned, 
	 * the values in the array passed should not change. 
	 */
	public static int[] getCopy(int[] data) {
		if (data==null) {
			return null;
		}
		int[] newArr = new int[data.length];
		for(int i =0; i<data.length; i++) {
			newArr[i] = data[i];
		}
		return newArr; //to be completed
	}
}
