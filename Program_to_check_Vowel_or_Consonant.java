import java.util.*;
public class Aditya
{
    public static void main(String args[])
    {
        Scanner md = new Scanner (System.in);
        char n;
        n = md.nextLine().charAt(0);
        if (n == 'A' || n == 'a' || n == 'E' ||n == 'e' ||n == 'I' ||n == 'i' ||n == 'O' ||n == 'o' ||n == 'U' ||n == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}