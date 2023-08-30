import java.util.*;
public class SwitchCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] switches = new boolean[n];
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j < n; j += i) {
                switches[j] = !switches[j];
            }
        }
        int c = 0;
        for (boolean isOn : switches) {
            if (isOn) {
                c+=1;
            }
        }
        System.out.println(c); 
    }
}