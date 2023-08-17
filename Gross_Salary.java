import java.util.*;
public class grossSalary{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        double bs,da=0.0,hra=0.0,gs;
        bs = s.nextDouble();
        if(bs<=10000){
            da = bs*0.80;
            hra = bs*0.20;
        }
        else if(bs<=20000){
            da = bs*0.90;
            hra = bs*0.25;
        }
        else if(bs>20000){
            da = bs*0.95;
            hra  = bs*0.30;
        }
        gs = (bs+da+hra);
        System.out.printf("%.2f",gs);
    }
}