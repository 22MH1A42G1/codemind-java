import java.util.Scanner;
public class OctToBin {
    public static void main(String adi[]) {
        Scanner s = new Scanner(System.in);
        int t, i;
        t = s.nextInt();
        s.nextLine(); 

        for (i = 0; i < t; i++) {
            String oct = s.nextLine();
            int b = Integer.parseInt(oct, 8);
            String bin = Integer.toBinaryString(b);

           
            
            System.out.println(bin);
        }
    }
}
