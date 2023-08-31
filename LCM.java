import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }
    }
}