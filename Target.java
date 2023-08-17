import java.util.*;
public class Target{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int a,b,c,d;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}