import java.util.*;
public class Aditya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = l; i <= r; i++) {
            int t = i;
            int s=1;
            while (t != 0) {
                int d = t % 10;
                if (d == 0 || i % d != 0) {
                    s=0;
                }
                t /= 10;
            }
            if (s==1) {
                System.out.print(i + " ");
            }
        }
    }
}