import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m,hr,mi;
        m = sc.nextInt();
        hr = m / 60;
        mi = m % 60;
        
        System.out.printf("%d Hour(s) %d Minute(s)",hr,mi);

    }
}