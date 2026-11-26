import java.util.Scanner;
public class ValidTriangle {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the three angles of the triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a+b+c == 180)
            System.out.println("This is a valid triangle.");
        else
            System.out.println("It is not a valid triangle.");

        sc.close();
    }
}
