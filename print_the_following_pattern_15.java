import java.util.*;
public class aditya{
public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.format("%c ",i+64);
            
        }
        System.out.println();
    }
}
}


