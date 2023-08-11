import java.util.Arrays;

public class UF {
	private int[] ids;
	private int[] sizes;
	
	public UF(int n) {
		ids = new int[n];
		for (int i = 0; i<n; i++) {
			ids[i] = i;
			sizes[i] = 1;
		}
	}
	
	public boolean QFconnected(int p, int q) {
		return ids[p]==ids[q];
	}
	
	public void QFunion(int p, int q) {
		int pid = ids[p];
		int qid = ids[q];
		for (int i = 0; i < ids.length; i++) {
			if(ids[i]==pid)
				ids[i] = qid;
		}
	}
	
	public int QUroot(int i) {
		while(i!=ids[i]) {
			i=ids[i];
		}
		return i;
	}
	
	public void QUunion(int p, int q) {
		int i = QUroot(p);
		int j = QUroot(q);
		ids[i] = j;
	}
	
	
	public int WeightedQUroot(int i) {
		while (i!=ids[i]) {
			i = ids[i];
		}
		return i;
	}
	
	//O(log(n)) for unioning and finding. 
	//The depth of the tree increases by 1 every union when size of T2 >= T1
	//As the depth increases by 1, the number of nodes in the tree at least doubles
	//Find is proportional to depth and time complexity is explained above for unions
	public void WeightedQUunion(int p, int q) {
		int i = WeightedQUroot(p);
		int j = WeightedQUroot(q);
		
		if (i==j) return;
		if(sizes[i] < sizes[j]) {
			ids[i] = j;
			sizes[j] += sizes[i];
		}
		else {
			ids[j] = i;
			sizes[i] += sizes[j];
		}
	}
	
	//Every node points to their grandparent which will shorten the path length by half
	//This reorganizes the tree to double the search speed
	public int PathCompressionAndRoot(int i) {
		while(i!=ids[i]) {
			ids[i] = ids[ids[i]];
			i=ids[i];
		}
		return i;
	}
	
	public int[] returnIds() {
		return ids;
	}
	
	public String toString() {
		return "ids: " + Arrays.toString(ids);
	}
}
