import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,sa,v;
        n=sc.nextInt();
        sa=6*n*n;
        v=n*n*n;
        System.out.println("Surface area = "+sa+" and Volume = "+v);
    }
}
