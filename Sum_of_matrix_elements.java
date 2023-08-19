import java.util.Scanner;
public class Sumofmatrixelements{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        int n,m;
        n=s.nextInt();
        m=s.nextInt();
        int[][]  arr= new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0 ; j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i =0;i<n;i++){
            for(int j =0 ; j<m;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}