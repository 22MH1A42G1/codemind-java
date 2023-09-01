import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class FillMatrix {
    public static int minIterations(int N, int M, int X, int Y) {
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();
        int[] start = {X - 1, Y - 1};
        visited[start[0]][start[1]] = true;
        queue.add(start);
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int iterations = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];
                    if (newX >= 0 && newX < N && newY >= 0 && newY < M && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        queue.add(new int[]{newX, newY});
                    }
                }
            }
            iterations++;
        }

        return iterations - 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        int result = minIterations(N, M, X, Y);
        System.out.println(result); 

        
    }
}
