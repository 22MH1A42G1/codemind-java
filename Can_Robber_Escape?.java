import java.util.Scanner;
public class RobberEscape{
    public static void main(String args[]){
        int N,c=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int A[] =new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            if(A[i]%2!=0)
            c++;
        }
        if(c>2)
        System.out.print("NO");
        else
        System.out.print("YES");
    }
}