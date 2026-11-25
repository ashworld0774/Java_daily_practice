import java.util.Scanner;
public class KnowAscii {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        int a = (int)(ch);
        System.out.println("The AScII value for this character is : "+a);

        sc.close();

    }
}
