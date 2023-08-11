package week11practicePackage;

public class NodeService {
	/**
	 * 
	 * @param start
	 * @return the first value starting at start, null if none
	 * 	//start -> 10 -> 70 -> 20 -> 90 -> null: return 10
		//start -> null: return null
	 */
	public static Integer getFirstValue(Node start) {
		if (start==null)
			return null;
		return start.data; //to be completed
	}

	/**
	 * @param start
	 * @return the sum of all values starting at start. 0 if none
	 * start -> 10 -> 70 -> 20 -> 90 -> null: return 190 (10 + 70 + 20 + 90)
	 */
	public static int sum(Node start) {
		if (start==null)
			return 0;
		int sum = 0;
		for(Node curr = start; curr !=null; curr=curr.next) {
			sum += curr.data;
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @param low
	 * @param high
	 * @return the sum of all values starting at start that are 
	 * in the range [low...high] (inclusive on both sides). 0 if none.
	 * start -> 10 -> 70 -> 20 -> 80 -> null
	 * low = 20, high = 70: return 90 (20 + 70)
	 */
	public static int sumInRange(Node start, int low, int high) {
		if (start==null)
			return 0;
		int sum = 0;
		for(Node curr = start; curr !=null; curr=curr.next) {
			if (low <= curr.data && curr.data <= high) {
				sum += curr.data;
			}
		}
		return sum; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @param target
	 * @return true if the value target exists starting at start, false otherwise
	 * start -> 10 -> 70 -> 20 -> 80 -> null
	 * target = 20: return true
	 * target = 90: return false
	 */
	public static boolean contains(Node start, int target) {
		if (start==null)
			return false;
		for(Node curr = start; curr!=null; curr=curr.next) {
			if (curr.data == target)
				return true;
		}
		return false; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @return true if all values starting at start are negative, false otherwise
	 * start -> -10 -> -70 -> -20 -> -80 -> null: return true
	 * start -> -10 -> -70 -> -20 -> 80 -> null: return false
	 * start -> 0 -> -70 -> -20 -> -80 -> null: return false
	 * start -> null: return true
	 */
	public static boolean allNegative(Node start) {
		if (start==null)
			return false;
		for(Node curr = start; curr!=null; curr=curr.next) {
			if (curr.data >= 0)
				return false;
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @return the last value in the chain starting at start. return null if start is null
	 * start -> 10 -> 70 -> 20 -> 90 -> null: return 90
	 * start -> null: return null
	 */
	public static Integer getLastValue(Node start) {
		if (start==null)
			return null;
		for(Node curr = start; curr!=null; curr=curr.next) {
			if (curr.next==null)
				return curr.data;
		}
		return null; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @param target
	 * @return true if target exists exactly once in the chain starting at start, false otherwise
	 * start -> 10 -> 70 -> 20 -> 80 -> null, target = 10: return true
	 * start -> 10 -> 70 -> 20 -> 80 -> null, target = 50: return false
	 * start -> 10 -> 70 -> 20 -> 70 -> null, target = 70: return false
	 * start -> null, target = 10: return false
	 */
	public static boolean occursExactlyOnce(Node start, int target) {
		if (start==null)
			return false;
		int count = 0;
		for (Node curr = start; curr != null; curr = curr.next) {
			if (curr.data == target)
				count++;
		}
		if (count==1)
			return true;
		return false; //to be completed
	}

	/**
	 * 
	 * @param start
	 * @return a reference to the first node starting at start that holds a positive value, 
	 * return null if no such node exists
	 * start -> -3 -> 0 -> 8 -> -5 -> 0  -> 2 -> null:
	 * return node (n) such that n -> 8 -> -5 -> 0  -> 2 -> null
	 * 
	 * start -> -3 -> 0 -> -5 -> null: return null
	 */
	public static Node firstPositiveNode(Node start) {
		if (start==null)
			return null;
		for(Node curr = start; curr!=null; curr=curr.next) {
			if (curr.data > 0)
				return curr;
		}
		return null; //to be completed
	}
}
