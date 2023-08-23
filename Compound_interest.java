import java.util.*;
public class CompoundInterest {
    public static void main(String $aditya[]) {
        Scanner sc = new Scanner(System.in);
        double pr,ra,ti,comin;
        pr=sc.nextInt();
        ra=sc.nextDouble();
        ti=sc.nextInt();
        comin=pr*(Math.pow((1+(ra/100)),ti));
        System.out.printf("%.2f",comin);
    }
}