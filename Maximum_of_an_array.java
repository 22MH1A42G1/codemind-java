import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class MaximumofanArray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}