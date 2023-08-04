import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y,z,a,b;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=z-y;
        b=a/x;
        System.out.println(b);
    }
}