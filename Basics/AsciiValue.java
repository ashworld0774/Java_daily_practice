import java.util.Scanner;
public class AsciiValue {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println("The Ascii value of entered character is : "+ascii);

        System.out.println("---------------------------------------------------------");

        System.out.print("Enter the Ascii value : ");
        int a = sc.nextInt();

        char ch1 = (char)a;

        System.out.println("The Ascii value of entered character is : "+ch1);

        sc.close();
    }
}
