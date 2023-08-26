import java.util.Scanner;
public class Maximum69Number {
    public static void main(String[] $aditya) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a);
        char[] arr = b.toCharArray();    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9'; 
                break; 
            }
        }
        String res = new String(arr); 
        int maxnum = Integer.parseInt(res); 
        System.out.println(maxnum);
    }
}
