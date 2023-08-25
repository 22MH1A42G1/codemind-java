import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] arr = a.toCharArray();
        for (int i=0; i<arr.length; i++){
            if (arr[i] == '6') {
                arr[i] = '9';
                break; 
            }
        }
        String result = new String(arr);
        System.out.println(arr);
    }
}