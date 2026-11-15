/*Write a Java program to calculate the final price of a product after applying a discount. Also, calculate whether the seller makes a profit or loss based on the cost price and selling price, and find the profit or loss percentage accordingly.*/
import java.util.Scanner;
public class Discount {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== ============");
        System.out.print("Enter the cost price pf the product: ");
        double cp = sc.nextDouble();
        System.out.print("Enter the selling price of the product: ");
        double sp = sc.nextDouble();
        System.out.print("Enter the dicount (in percentage): ");
        double dis = sc.nextDouble();

        double mp = sp - (dis/100);

        if (cp < mp)
        {
            System.out.print("You have made a profit of "+ (sp-cp) + " Rs." );
            double pp = (sp - cp) / sp *100;
            System.out.print("that means "+ pp + "% of profit.");
        }
        else
        {
            System.out.print("You have incurred a loss of "+ (cp-sp) + " Rs." );
            double lp = (cp - sp) / cp *100;
            System.out.print("that means "+ lp + "% of loss.");
        }

        sc.close();
    }
}
