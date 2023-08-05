import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int y;
        y = sc.nextInt();
        System.out.printf("%02d",y%100);
    }
}