import java.util.*;
public class Aditya{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n,sum=0;
        n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}