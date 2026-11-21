import java.util.Scanner;

public class Zero {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n==0)
            System.out.println("It is a zero");
        else
            System.out.println("It is a non-zero number");
        sc.close();
    }
}
