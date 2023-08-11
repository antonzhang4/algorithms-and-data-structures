package main;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int BinarySearch(int[] array, int target, int low, int high) {
		if (array==null)
			return -1;
		if(array.length==0)
			return -1;
		if (low > high)
			return -1;
		int median = low + (high - low)/2;
		if(array[median] == target) {
			return median;
		}
		if(array[median] > target) {
			return BinarySearch(array, target, low, median-1);
		}
		return BinarySearch(array, target, median+1, high);
	}
}

