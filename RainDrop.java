import java.util.*;
public class RainDrop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%3==0)
            System.out.printf("Pling");
        if(n%5==0)
            System.out.printf("Plang");
        if(n%7==0)
            System.out.printf("Plong");
        if(n%3!=0 && n%5!=0 && n%7!=0)
            System.out.println(n);
    }
}