/*Q. Write a Java program to calculate Simple Interest (SI) and Compound Interest (CI). */
import java.util.Scanner;
public class Interest {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("==============Simple and compound interest ====================");
        System.out.print("Enter the Principal Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time period in years: ");
        double t = sc.nextDouble();
        System.out.println("----------------------------------------------------------------");

        double si = (p*r*t)/100;
        double totalamt = p+si;
        System.out.println("So the simple interest is of "+ si+ " Rs.");
        System.out.println("Thus the total amount is : "+ totalamt + " Rs.");
        System.out.println("------------------------------------------------------------------");

        double A = p*(Math.pow(1+(r/100),t));
        double ci = A - p;
        System.out.println("The compound interest is : "+ ci+ " Rs.");
        System.out.println("Thus the total amount is : "+ A+ " Rs.");
        System.out.println("====================================================================");

        sc.close();
    }
}
