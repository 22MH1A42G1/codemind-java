import java.util.*;
public class aditya{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        char n;
        n=s.next().charAt(0);
        if(n>='A' && n<='Z'){
            System.out.println("uppercase alphabet");
        }else if(n>='a' && n<='z'){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}