import java.util.Scanner;
public class Ascii {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the ASCII value to recognize character: ");
        int val = sc.nextInt();

        if (val >= 65 && val <= 90)
            System.out.println("It is an uppercase character");
        else if (val>=97 && val<=122)
            System.out.println("It is an lowercase character");
        else if (val>=48 && val<=57)
            System.out.println("It is a digit");
        else
            System.out.println("It is any symbol");

        sc.close();

        }
}
