import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] $aditya) {
        Scanner scanner = new Scanner(System.in);
        int u;
        float c, b, sr, tb;
        u = scanner.nextInt();

        if (u < 200) {
            c = 1.20f;
            b = u * c;
        } else if (u >= 200 && u < 400) {
            c = 1.40f;
            b = u * c;
        } else if (u >= 400 && u < 600) {
            c = 1.60f;
            b = u * c;
        } else if (u >= 600 && u < 800) {
            c = 1.80f;
            b = u * c;
        } else {
            c = 2.00f;
            b = u * c;
        }

        if (b > 400) {
            sr = b * 0.15f;
            tb = b + sr;
        } else {
            sr = 0;
            tb = b + sr;
        }

        System.out.println("Units Consumed: " + u);
        System.out.println("Cost per Unit: " + String.format("%.2f", c));
        System.out.println("Bill: " + String.format("%.2f", b));
        System.out.println("Surcharge: " + String.format("%.2f", sr));
        System.out.println("Total Amount: " + String.format("%.2f", tb));
        
        scanner.close();
    }
}
