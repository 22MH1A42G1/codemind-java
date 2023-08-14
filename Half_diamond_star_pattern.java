import java.util.*;
public class aditya{
public static void main(String halfDiamand[]){
    int a;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a>=3 && a<=100)
    {
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("
");
        }
        for(int i=a;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.print("
");
        }
    }
    else
    System.out.print("The pattern is not possible");
}
}