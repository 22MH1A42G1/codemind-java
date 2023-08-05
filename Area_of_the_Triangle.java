import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double S,A;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        S= (float)(a+b+c)/2;
        A=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println(String.format("%.2f",A));
    }
}
