import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < t; i++) {
            String b = sc.nextLine();
            int d = Integer.parseInt(b, 2);
            String o = Integer.toOctalString(d);
            System.out.println(o);
        }
    }
}
