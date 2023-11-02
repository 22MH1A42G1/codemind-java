import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,s,d,p,q,r;
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        d=a-b;
        p=a*b;
        q=a/b;
        r=a%b;
        System.out.printf("Sum:%d%nDifference:%d%nProduct:%d%nQuotient:%d%nRemainder:%d",s,d,p,q,r);
    }
}