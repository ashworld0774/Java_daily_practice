import java.util.Scanner;

public class PosNeg {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n==0)
            System.out.println("It is zero");
        else if(n>0)
            System.out.println("It is a Positive number");
        else
            System.out.println("It is a Negative number");

        sc.close();
    }
}