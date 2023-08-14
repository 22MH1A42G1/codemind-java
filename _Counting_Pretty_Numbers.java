import java.util.*;
public class PrettyNumbers {
    public static void main(String[] aditya) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 0; t < T; t++) {
            int L = s.nextInt();
            int R = s.nextInt();
            int cn = 0;
            for (int i= L; i <= R; i++) {
                int l = i % 10;
                if (l == 2 || l == 3 || l == 9) {
                    cn++;
                }
            }
            System.out.println(cn);
        }
    }
}