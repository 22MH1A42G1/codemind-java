import java.util.Scanner;
public class AddDigits {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = addDigits(n);
        System.out.println(r);
    }

    public static int addDigits(int n) {
        int sum = n;
        while (sum >= 10) {
            String sumStr = Integer.toString(sum);
            int[] digits = new int[sumStr.length()];
            for (int i = 0; i < sumStr.length(); i++) {
                digits[i] = Character.getNumericValue(sumStr.charAt(i));
            }
            sum = sumOfDigits(digits);
        }
        return sum;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
