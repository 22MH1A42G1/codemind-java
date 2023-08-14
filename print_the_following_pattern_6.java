import java.util.*;
public class aditya{
public static void main(String args[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=a;j>=1;j--)
        System.out.print(j+" ");
        System.out.println();
    }
}
}