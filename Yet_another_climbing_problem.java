import java.util.Scanner;
public class climbling{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt(); 
        for (int i = 0; i < T; i++) {
            int X = s.nextInt(); 
            int Y = s.nextInt(); 
            int moves = getMinMoves(X, Y);
            System.out.println(moves);
        }
    }
    private static int getMinMoves(int X, int Y) {
        if (X % Y == 0) {
            return X / Y;
        }
        else{
            int a = (int) X / Y;
            int b = a + X % Y;
            return b;
        }
    }
}