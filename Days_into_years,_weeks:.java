import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y,w,d;
        d=sc.nextInt();
        y=(d/365);
        w=(d%365)/7;
        System.out.printf("%d
%d",y,w);
    }
}