/*Calculate the total bill of a customer purchasing three products. */
import java.util.Scanner;
public class CustomerBill {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Product1 name: ");
        String p1 = sc.next();
        System.out.print("Price of product 1: ");
        double pr1 = sc.nextDouble();
        System.out.print("Enter Product2 name: ");
        String p2 = sc.next();
        System.out.print("Price of product 2: ");
        double pr2 = sc.nextDouble();
        System.out.print("Enter Product3 name: ");
        String p3 = sc.next();
        System.out.print("Price of product 3: ");
        double pr3 = sc.nextDouble();

        double totalbill = pr1 +pr2+pr3;
        
        System.out.println("=================================");
        System.out.println("           Customer Bill          ");
        System.out.println("=================================");

        System.out.println("Product Name            Price    ");
        System.out.println("---------------------------------");

        System.out.println(p1+"              "+pr1);
        System.out.println(p2+"              "+pr2);
        System.out.println(p3+"              "+pr3);
        System.out.println("---------------------------------");
        System.out.println("Total bill:             "+totalbill+"/-");
        System.out.println("=================================");

        sc.close();

    }
}
