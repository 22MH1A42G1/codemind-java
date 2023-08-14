import java.util.*;
public class aditya{
public static void main(String args[]){
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j<=n;j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}