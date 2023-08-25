import java.util.*;
public class AverageElementIsInArrayOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int  sum=0;
        for(int i:arr){
            sum+=i;
        }
       int  avg=(sum/n);
        int fact=0;
        for(int i:arr){
            if(avg==i){
                fact=1;
            }
        }
        if(fact==1){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}