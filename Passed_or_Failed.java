import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for five subjects
        int english, maths, physics, chemistry, computerScience;
        english = scanner.nextInt();
        maths = scanner.nextInt();
        physics = scanner.nextInt();
        chemistry = scanner.nextInt();
        computerScience = scanner.nextInt();

        // Check if the student has more than 34 marks in EACH subject
        if (english > 34 && maths > 34 && physics > 34 && chemistry > 34 && computerScience > 34) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}