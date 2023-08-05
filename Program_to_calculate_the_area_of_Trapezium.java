import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double b1,b2,h,ar;
        b1=sc.nextDouble();
        b2=sc.nextDouble();
        h=sc.nextDouble();
        ar=(b1+b2)/2*h;
        System.out.printf("%.4f",ar);
    }
}