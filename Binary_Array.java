import java.util.*;
public class BinaryArray {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] != 0 && a[i] != 1) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}