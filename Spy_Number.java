import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0, p = 1, r;
        while(n>0) {
            r = n % 10;
            s += r;
            p *= r;
            n /= 10;
        }
        System.out.println((s==p)?"Spy Number":"Not Spy Number");
    }
}
