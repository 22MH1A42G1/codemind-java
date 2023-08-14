import java.util.*;
public class FuelExpenses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 0; t < T; t++) {
            int x1 = s.nextInt();
            int x2 = s.nextInt();
            int y1 = s.nextInt();
            int y2 = s.nextInt();
            double c1 = (double) y1 / x1;
            double c2 = (double) y2 / x2;
            if (c1 < c2) {
                System.out.println("-1");
            } else if (c1 > c2) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
