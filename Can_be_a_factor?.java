import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();  
        int f;
        for (int i = 0; i <n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if(a==b)
            {
                System.out.println("YES");
                f=1;
            }
            else if((int)(b/a)>1)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}