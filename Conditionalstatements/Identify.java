import java.util.Scanner;

public class Identify {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        if (ch >='A' && ch <= 'Z')
            System.out.println("Entered character is in uppercase");
        else if (ch >='a' && ch <= 'z')
            System.out.println("Entered character is in lowercase");
        else if (ch >='0' && ch <= '9')
            System.out.println("Entered character is a digit");
        else 
            System.out.println("Entered character is a special symbol");

        sc.close();
    }
}
