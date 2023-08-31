import java.util.Scanner;
public class FibonacciNearest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int a = 0;
        int b = 0;
        for (int j = n; j > 0; j--) {
            int fibResult = fib(j);
            if (fibResult != -1) {
                a = j;
                break;
            }
        }
        
        while (k != 0) {
            int fibResult = fib(k);
            if (fibResult != -1) {
                b = k;
                break;
            }
            k++;
        }
        
        if (Math.abs(n - a) < Math.abs(b - n)) {
            System.out.println(a);
        } else if (Math.abs(n - a) == Math.abs(b - n)) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b);
        }
    }
    
    public static int fib(int j) {
        int a = 0;
        int b = 1;
        int c = a + b;
        
        while (c < j) {
            c = a + b;
            a = b;
            b = c;
        }
        
        if (c == j) {
            return j;
        } else {
            return -1;
        }
    }
}
