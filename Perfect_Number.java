import java.util.Scanner;
public class aditya {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Perfect number
        int n = sc.nextInt();
        int sum=0;
        if(n>0){
            for(int i =1;i<=(n/2);i++){
                if(n%i==0){
                    sum+=i;
                }
            }
            System.out.println((sum==n)?"True":"False");
        }
        else{
            System.out.println("False");
        }
    }
}