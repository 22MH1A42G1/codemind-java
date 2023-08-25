import java.util.*;
public class StrictlyOdd{
    public static void main(String arggs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i,c=0,s=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==1){
                c+=1;
            }
            if(a[i]%2==1 && i%2==1){
                s+=1;
            }
        }
        System.out.println((s==c)?"True":"False");
    }
}