/* Calculate HRA, DA, and Gross Salary.
Question: Write a Java program to calculate House Rent Allowance (HRA), Dearness Allowance (DA), and Gross Salary of an employee.
input:
- Basic Salary, hra and dra */
import java.util.Scanner;
public class Salary {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double s = sc.nextDouble();
        System.out.print("Enter the percentage of hra: ");
        double h = sc.nextDouble();
        System.out.print("Enter the percentage of dra: ");
        double d = sc.nextDouble();

        System.out.println("The House Rent Allowance (HRA) is : " + (s*h)/100);
        System.out.println("The Dearness Allowance (DA) is : " + (d*s)/100);
        System.out.println("The Gross Salary is : " + (s+h+d));

        sc.close();
    }
}
