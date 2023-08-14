import java.util.*;
public class HPSum {
    public static void main(String[] aditya) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double sum = 0.0;
        for (int n = 1; n <= N; n++) {
            sum += 1.0 / (n);
        }
        System.out.printf("%.2f%n", sum);
    }
}