import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p,r,t,ci;
        p=sc.nextInt();
        r=sc.nextDouble();
        t=sc.nextInt();
        ci=p*(Math.pow((1+(r/100)),t))-p;
        System.out.println(String.format("%.2f",ci));
    }
}