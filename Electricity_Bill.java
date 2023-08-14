import java.util.*;
public class Aditya{
    public static void main(String eb[]){
        double b,u;
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        u=sc.nextDouble();
        if(u<199){
            b=1.20*u;
        }
        else if(u>=200 && u<400){
            b=1.5*u;
        }
        else if(u>=400 && u<600){
            b=1.8*u;
        }
        else{
            b=2*u;
        }
        if(b>400){
            b+=(0.15*b);
        }
        else{
            b+=100;
        }
        System.out.printf("%.2f",b);
    }
}