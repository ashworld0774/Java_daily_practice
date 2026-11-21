import java.util.Scanner;

public class GreatestofTwo {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        if (a==b)
            System.out.println("Both are equal");
        else if (a>b)
            System.out.println(a+" is greatest of two numbers \n"+b+" is the smallest of two");
        else 
            System.out.println(b+" is greatest of two numbers \n"+a+ " is the smallest of two");

        sc.close();
    }
}
