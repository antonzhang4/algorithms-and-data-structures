import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner StdIn1 = new Scanner(System.in);
		System.out.print("Enter number of objects: ");
		int N = StdIn1.nextInt();
		UF uf = new UF(N);
		while(true) {
			Scanner StdIn2 = new Scanner(System.in);
			System.out.print("Enter first node/object: ");
			String sp = StdIn2.nextLine();
			System.out.print("Enter second node/object: ");
			String sq = StdIn2.nextLine();
			if(sp.isEmpty() || sq.isEmpty())
				break;
			int p = Integer.valueOf(sp);
			int q = Integer.valueOf(sq);
			if (!uf.QFconnected(p,q)) {
				uf.QFunion(p,q);
				System.out.println(p + " " + q);
			}
			System.out.println(uf);
		}
	}
}