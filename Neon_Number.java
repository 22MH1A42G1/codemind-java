import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a * a;
        int s = 0;
        while (c != 0) {
            int i = c % 10;
            s += i;
            c = c / 10;
        }System.out.println((a==s)?"Neon Number":"Not Neon Number");
    }
}
