import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double bs,hra,da,pf,gs;
        bs = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();
        pf= bs*0.12;
        gs = bs+hra+da+pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}