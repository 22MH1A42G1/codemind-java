import java.util.Scanner;
public class Absolutedifferencebetweensumofevenandsumofoddindexedelements {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                s += a[i];
            } else {
                c += a[i];
            }
        }

        if (s > c) {
            System.out.println(s - c);
        } else {
            System.out.println(c - s);
        }
    }
}
