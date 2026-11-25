import java.util.Scanner;
public class UppertoLower {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        char U, L;

        if (ch>= 'a' && ch<='z')
        {
            U = (char)(ch-32);
            System.out.println("The converted character : "+U);
        }
            else if (ch >= 'A' && ch<='Z')
        {
            L = (char)(ch+32);
            System.out.println("The converted character : "+L);
            }
        else 
            System.out.println("Please enter any lowercase or uppercase character");

        sc.close();
        
    }
}
