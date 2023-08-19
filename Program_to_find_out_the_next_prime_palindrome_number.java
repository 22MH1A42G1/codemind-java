import java.util.Scanner;

public class NextPrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        
        if (inputNumber >= 10 && inputNumber <= 10000) {
            int nextPrimePalindrome = findNextPrimePalindrome(inputNumber);
            System.out.println(nextPrimePalindrome);
        } else {
            System.out.println("Input number must be between 10 and 10000 (inclusive).");
        }
        
        scanner.close();
    }

    public static int findNextPrimePalindrome(int num) {
        while (true) {
            num++;
            if (isPalindrome(num) && isPrime(num)) {
                return num;
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
