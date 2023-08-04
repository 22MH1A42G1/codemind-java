import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        double dis;
        int A=(c-a)*(c-a);
        int B=(d-b)*(d-b);
        dis = Math.sqrt(A+B);
        System.out.println(String.format("%.4f",dis));
    }
}