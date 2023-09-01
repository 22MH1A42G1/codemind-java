import java.util.Scanner;
public class LongestGoodString {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = 0;
        int c = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++; 
            } else {
                c = 0;
            }
            m = Math.max(m, c);
        }
        System.out.println(m);
    }
}
