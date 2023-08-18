import java.util.*;
public class pandemic{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n;
        n = s.nextInt();
        if(n==0 || n==1){
            System.out.println(0);
        }
        if(n==2){
            System.out.println(1);
        }
        if(n>=3){
            System.out.println(2);
        }
    }
}