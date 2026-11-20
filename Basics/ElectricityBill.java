/*Question: Write a Java program to calculate the total electricity bill based on the number of units consumed and the fixed rate per unit. */
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        System.out.print("Enter rate per unit: ");
        double rate = sc.nextDouble();

        double bill = units * rate;

        System.out.println("Total Electricity Bill = Rs. " + bill);

        sc.close();
    }
}
