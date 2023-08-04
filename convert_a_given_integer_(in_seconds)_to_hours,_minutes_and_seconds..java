import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s,h,m,ss;
        s=sc.nextInt();
        h=s/3600;
        m=(s-h*3600)/60;
        ss=(s-h*3600)-m*60;
        System.out.printf("H:M:S-%d:%d:%d",h,m,ss);
    }
}