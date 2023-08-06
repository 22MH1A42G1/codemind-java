import java.util.*;
public class Grades{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        boolean x,y,z;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=a>50;
        y=b>60;
        z=c>100;
        if(x && y && z)
        System.out.print(10);
        else if(x && y)
        System.out.print(9);
        else if(y && z)
        System.out.print(8);
        else if( x && z)
        System.out.print(7);
        else if(x || y || z)
        System.out.print(6);
        else
        System.out.print(5);
    }
}
