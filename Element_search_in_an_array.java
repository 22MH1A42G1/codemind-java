import java.util.*;
public class ElementSearchInAnArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t =sc.nextInt();
        int fact=0;
        for(int i=0;i<n;i++){
            if(t==arr[i]){
                fact=1;
                break;
            }
        }
        if(fact==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}