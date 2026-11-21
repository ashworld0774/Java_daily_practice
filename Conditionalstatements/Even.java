import java.util.Scanner;

public class Even {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n%2==0)
            System.out.println("It is an even number");
        else if(n%2!=0)
            System.out.println("It is a odd number");
        else
            System.out.println("It is zero");

        sc.close();
    }
}
