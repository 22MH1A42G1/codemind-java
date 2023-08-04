import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s,t,b,c;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        c=(s*t*b);
        System.out.println(c+" KB");
    }
}