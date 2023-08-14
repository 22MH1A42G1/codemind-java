import java.util.*;
public class aditya{
public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            if(i==j || j==n-i+1){
                System.out.print("x");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
    }
}