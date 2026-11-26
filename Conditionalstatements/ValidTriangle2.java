import java.util.Scanner;
public class ValidTriangle2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter all three sides of triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b)
            System.out.println("This is a valid triangle.");
        else
            System.out.println("This is not a valid triangle.");

        sc.close();
    }
}
