import java.util.*;
public class FindSpy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int N = s.nextInt();
        int[][] trust = new int[N][2]; 
        for (int i = 0; i < N; i++) {
            trust[i][0] = s.nextInt();
            trust[i][1] = s.nextInt();
        }
        int[] trustCounts = new int[n + 1]; 
        for (int i = 0; i < N; i++) {
            trustCounts[trust[i][0]]--; 
            trustCounts[trust[i][1]]++; 
        }
        int spy = -1;
        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == n - 1) {
                spy = i;
                break;
            }
        }
        System.out.println(spy);
    }
}