import java.util.*;
public class Display{
    public static void main(String[] Season) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        if(n==4||n==5||n==6){
            System.out.println("Summer");
        }
        else if(n==7||n==8||n==9||n==10){
            System.out.println("Rainy");
        }
        else if(n==11||n==12||n==1){
            System.out.println("Winter");
        }
        else if(n==2||n==3) {
            System.out.println("Spring");
        }
        else{
            System.out.println(-1);
        }
    }
}
