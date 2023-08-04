import java.util.Scanner;
public class inToCm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        float cm = 2.54f*in;
        System.out.println(String.format("%.2f",cm));
    }
}