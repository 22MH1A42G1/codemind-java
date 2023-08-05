import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double A = 3.14*t*t;
        double P = 2*3.14*t;
        System.out.printf("%.2f
%.2f",A,P);
    }
}