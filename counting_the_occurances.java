import java.util.Scanner;
public class aditya{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c=sc.nextLine().charAt(0);
        int f=0;
        for(char i:s.toCharArray()){
            if(i==c){
                f++;
            }
        }
        System.out.println((f>0)?f:-1);
    }
}