import java.util.Scanner;
public class VorC{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char n;
        n=sc.next().charAt(0);
        if(n=='a' || n=='e'|| n=='i'|| n=='o'|| n=='u'|| n=='A'|| n=='E'|| n=='I'|| n=='O'|| n=='U')
        System.out.print("Vowel");
        else
        System.out.print("Consonant");
    }
}