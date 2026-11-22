import java.util.Scanner;

public class Divisibility {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num%3==0 || num%7==0)
            System.out.println("yes it is divisible by 3 or 7");
        else
            System.out.println("No it is not divisible by 3 or 7");

        sc.close();
    }
}
