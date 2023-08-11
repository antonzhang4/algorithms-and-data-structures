import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// bubble sort
		int[] array = {5, 12, 7, 3, 8, 1, 9, 11, 4, 6, 10, 2};
		System.out.println("Unsorted Array: " + Arrays.toString(array));
		System.out.println("Bubble Sorted Array: " + bubbleSort(array));
		System.out.println();
		
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println("Bubble Sort on Sorted Array: " + bubbleSort(array));
		System.out.println();
		
		// selection sort
		int[] array2 = {14, 7, 23, 5, 18, 2, 11, 9, 30, 1};
		System.out.println("Unsorted Array: " + Arrays.toString(array2));
		System.out.println("Selection Sorted Array: " + selectionSort(array2));
		System.out.println();
		
		// insertion sort
		int[] array3 = {10, 5, 27, 3, 19, 8, 15, 2, 11, 6};
		System.out.println("Unsorted Array: " + Arrays.toString(array3));
		System.out.println("Insertion Sorted Array: " + insertionSort(array3));
		System.out.println();
		
		// quick sort
		int[] array4 = {23, 9, 56, 34, 87, 12, 45, 67, 5, 78};
		System.out.println("Unsorted Array: " + Arrays.toString(array4));
		System.out.println("Quick Sorted Array: " + quickSort(array4, 0, array4.length-1));
		System.out.println();
		
		// merge sort
		int[] array5 = {14, 32, 5, 22, 7, 18, 9, 27, 12, 4, 29, 3, 19, 17, 26, 8, 1, 30, 11, 23, 20, 6, 25, 2, 10, 16, 13, 28, 21, 15};
		System.out.println("Unsorted Array: " + Arrays.toString(array5));
		mergeSort(array5);
		System.out.println("Merge Sorted Array: " + Arrays.toString(array5));
		System.out.println();
		
		// 3 way quick sort
		int[] array6 = {15, 7, 28, 42, 3, 11, 25, 36, 19, 8, 2, 30, 20, 1, 16, 29, 5, 10, 24, 27, 12, 4, 23, 6, 22, 9, 26, 18, 14, 17};
		System.out.println("Unsorted Array: " + Arrays.toString(array6));
		quickSortThreeWay(array6, 0, array6.length-1);
		System.out.println("3 Way Quick Sorted Array: " + Arrays.toString(array6));
	}
	
	public static String bubbleSort(int[] array) {
		boolean isSorted = false;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if (isSorted) {
				System.out.println("Number of iterations of outerloop: " + count);
				break;
			}
			count++;
			isSorted = true;
			for(int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					isSorted = false;
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return Arrays.toString(array);
	}
	
	public static String selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return Arrays.toString(array);
	}
	
	public static String insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
				else break;
			}
		}
		return Arrays.toString(array);
	}
	
	public static String quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
		}
		return Arrays.toString(array);
	}
	
	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j <= high-1; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}	
	
	public static void quickSortThreeWay(int[] array, int low, int high) {
		if (high <= low) return;
		int i = low;
		int lt = low;
		int gt = high;
		int v = array[low];
		while (i <= gt) {
			if (array[i] < v) {
				int temp = array[i];
				array[i] = array[lt];
				array[lt] = temp;
				
				i++;
				lt++;
			}
			else if (array[i] > v) {
				int temp = array[i];
				array[i] = array[gt];
				array[gt] = temp;
				
				gt--;
			}
			else i++;
		}
		
		quickSortThreeWay(array, low, lt - 1);
		quickSortThreeWay(array, gt+1, high);
	}
	
	public static void mergeSort(int[] array) {
		int length = array.length;
		if (length <= 1) return;
		else if (length <= 10) {
			insertionSort(array);
			return;
		}
		int middle = length/2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0;
		int j = 0;
		for (; i<array.length; i++) {
			if (i<middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		if (leftArray[leftArray.length-1] < rightArray[0]) return;
		merge(array, leftArray, rightArray);
	}
	
	public static void merge(int[] array, int[] leftArray, int[] rightArray) {
		int leftSize = leftArray.length;
		int rightSize = array.length - leftSize;
		int i = 0;
		int left = 0;
		int right = 0;
		while (left < leftSize && right < rightSize) {
			if (leftArray[left] < rightArray[right]) {
				array[i] = leftArray[left];
				i++;
				left++;
			}
			else {
				array[i] = rightArray[right];
				i++;
				right++;
			}
		}
		while (left < leftSize) {
			array[i] = leftArray[left];
			i++;
			left++;
		}
		while (right < rightSize) {
			array[i] = rightArray[right];
			i++;
			right++;
		}
	}
}
