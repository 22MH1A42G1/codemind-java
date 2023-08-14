import java.util.*;
public class pro{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1,n2,x;
        n1=sc.nextInt();
        n2=sc.nextInt();
        x=sc.nextInt();
        if(n1>=n2){
            System.out.print(-1);
        }
        else{
            int c = 1;
            int a = n1;
            int b = n2;
            while((x+a) >= b ){
                c+=1;
                a+=n1;
                b+=n2;
            }
            System.out.println(c);
        }
    }
}