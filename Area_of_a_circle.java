import java.util.Scanner;
public class AreaOfACircle{
    public static void main(String $aditya[]){
        Scanner adi = new Scanner(System.in);
        int radiusOfCircle = adi.nextInt();
        double AreaOfCircle = 3.14*radiusOfCircle*radiusOfCircle;
        System.out.printf("%.2f",AreaOfCircle);
    }
}