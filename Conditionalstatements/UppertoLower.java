import java.util.Scanner;
public class UppertoLower {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the lowercase character: ");
        char ch = sc.next().charAt(0);

        char U = (char)(ch-32);
        System.out.println("The converted character : "+U);

        sc.close();
        
    }
}
