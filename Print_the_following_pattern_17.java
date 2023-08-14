import java.util.*;
public class aditya{
public static void main(String args[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a;j++)
        {
            if(i==j || j==a-i+1)
            System.out.format("%d ",a-i+1);
             else
             System.out.print(" ");
            
        }
        System.out.println();
    }
}
}
