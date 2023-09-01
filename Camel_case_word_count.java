import java.util.*;
public class Camelcase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] w = s.split("(?=[A-Z])");
        System.out.println(w.length);
    }
}