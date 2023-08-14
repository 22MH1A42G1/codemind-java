import java.util.*;
public class SumOfSquares {
    public static boolean isSumOfSquares(int n) {
        if (n < 0) {
            return false;
        }

        int u = (int) Math.sqrt(n) + 1;
        for (int i = 1; i < u; i++) {
            int r = n - i * i;
            int ro = (int) Math.sqrt(r);
            if ((r >= 0) && (ro * ro == r) && (ro != i)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println((isSumOfSquares(n)==true) ? "True" : "False");
    }
}
