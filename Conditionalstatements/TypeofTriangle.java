import java.util.Scanner;
public class TypeofTriangle{
    public static void main ( String [] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of triangle a: ");
        int a = scan.nextInt();
        System.out.println("Enter the side of triangle b: ");
        int b = scan.nextInt();
        System.out.println("Enter the side of triangle c: ");
        int c = scan.nextInt();

        if (a == b && b==c)
        {
            System.out.println("This is an equilateral triangle");
        }
        else if ( a == b || b == c || c == a )
        {
            System.out.println("This is an isosceles triangle");
        }
        else if (a == Math.sqrt(b*b + c*c) ||b == Math.sqrt(a*a + c*c) ||c == Math.sqrt(b*b + a*a) )
        {
            System.out.println("This is a right angled triangle");
        }
        else                                {
            System.out.println("This is a scalane triangle");
        }
        scan.close();
    }
}