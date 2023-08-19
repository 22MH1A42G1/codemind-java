import java.util.Scanner;

public class Hexa {
    public static void main(String adi[]) {
        Scanner s = new Scanner(System.in);
        int t, i;
        t = s.nextInt();
        s.nextLine(); 

        for (i = 0; i < t; i++) {
            String hex = s.nextLine();
            int b = Integer.parseInt(hex, 16);
            String binary = Integer.toBinaryString(b);
            int expectedLength = hex.length() * 4;
            
            while (binary.length() < expectedLength) {
                binary = "0" + binary;
            }
            
            System.out.println(binary);
        }
    }
}
