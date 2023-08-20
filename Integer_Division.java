import java.math.BigInteger;
import java.util.*;
public class newwww{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n;
        n=sc.nextLong();
        if(0<n){
            System.out.println(n/10);
        }
        else if(0>n){
            if(n%10==0){
                System.out.println(n/10);           
            }
            else{
                System.out.println((n/10)-1);
            }
        }
    }
}