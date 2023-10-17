import java.util.Scanner;
public class Pattern {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 2 * n - 1;
		int f = 0;
		int b = s - 1;
		int a[][] = new int[s][s];
		while (n != 0) {
			for (int i = f; i <= b; i++) {
				for (int j = f; j <= b;	j++) {
					if (i == f || i == b || j == f || j == b){
					    a[i][j] = n;
					}
				}
			}
			++f;
			--b;
			--n;
		}
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}