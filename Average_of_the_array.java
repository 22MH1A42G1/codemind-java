import java.util.*;
public class AverageOfTheArray{
    public static void main(String $Aditya[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i:arr){
            sum+=i;
        }
        double avg = sum/n;
        System.out.printf("%.2f",avg);
    }
}