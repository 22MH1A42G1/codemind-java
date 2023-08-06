import java.util.Scanner;
import java.lang.Math;
public class java{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        String[] tP = t.split(":");
        int h = Integer.parseInt(tP[0]);
        int m = Integer.parseInt(tP[1]);
        double c = Math.abs((h*30)-(5.5*m));
        double d = 360 - c;
        if (c < d) {
            System.out.printf("%.1f",c);
        }
        else
            System.out.printf("%.1f",d);
    }
}
