import java.util.*;
public class AmicableNumber {
    public static void main(String $aditya[]){
        Scanner sc = new Scanner (System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = 0;
        int d = 0;
        for (int i=1;i<a;i++)
        {
            if (a%i == 0){
                c+=i;
            }
        }
        for (int i=1;i<b;i++){
            if (b%i == 0){
                d+=i;
            }
        }
        if (c == b && d == a){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}