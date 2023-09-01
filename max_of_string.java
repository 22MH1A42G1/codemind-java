import java.util.Scanner;
public class MaxValuedCharacterInString {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char m = NULL;
        int max = Integer.MIN_VALUE;
        for (char i : s.toCharArray()) {
            int asc = (int) i;
            if (asc > max) {
                max = asc;
                m = i;
            }
        }
        System.out.println(m);
    }
}
