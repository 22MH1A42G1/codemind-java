import java.util.Scanner;
public class Monopoly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int t = 0; t < T; t++) {
            int R1 = s.nextInt();
            int R2 = s.nextInt();
            int R3 = s.nextInt();
            if (R1 > R2 + R3 || R2 > R1 + R3 || R3 > R1 + R2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
}
