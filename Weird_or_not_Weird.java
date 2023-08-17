import java.util.*;
public class Weird{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        if(n%2!=0){
            System.out.println("weird");
        }
        else if(n%2==0 && n>=2 && n<=5){
            System.out.println("not weird");
        }
        else if(n%2==0 && n>=6 && n<=20){
            System.out.println("weird");
        }
        else if(n%2==0 && n>20){
            System.out.println("not weird");
        }
        else{
            System.out.println(-1);
        }
    }
}