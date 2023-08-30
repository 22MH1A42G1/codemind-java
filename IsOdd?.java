import java.util.Scanner;

public class Aditya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = isOdd(n);
        System.out.println(res);
    }

    public static int isOdd(int n) {
        if (n % 2 == 0) {
            return 1;
        } else {
            return 2;
        }
    }
}
