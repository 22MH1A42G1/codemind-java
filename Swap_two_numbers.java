import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        a+=b;
        b=a-b;
        a=a-b;
        System.out.printf("%d
%d",a,b);
    }
}