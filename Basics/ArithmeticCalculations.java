/*Take two numbers as input.
Perform the the arithmetic calculations and print properly */


import java.util.Scanner;
public class ArithmeticCalculations {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("==========Arithmetic Calculations with two operands==========");
        System.out.print("Enter two numbers : ");
        double a = scan.nextInt(), b = scan.nextInt();

        double sum = a+b;
        double subtract = a - b;
        double multiply = a*b;
        double divide = a/b;
        double mod = a%b;


        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: "+subtract);
        System.out.println("Multiplication: "+multiply);
        System.out.println("Division: " +divide);
        System.out.println("Modulus: "+mod);
        System.out.println("=============================================================");
        
        scan.close();
    }
}
    
