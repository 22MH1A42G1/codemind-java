import java.util.Scanner;

public class OctToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oct = scanner.nextLine();
        int dec = OctTooDec(oct);
        System.out.println(dec);
    }

    public static int OctTooDec(String oct) {
        int dec = 0;
        int l = oct.length();
        for (int i = l - 1; i >= 0; i--) {
            char d = oct.charAt(i);
            int A = Character.getNumericValue(d);
            dec += A * Math.pow(8, l - 1 - i);
        }
        return dec;
    }
}
