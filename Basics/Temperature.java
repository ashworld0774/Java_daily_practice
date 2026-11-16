/*Write a Java program to convert temperature from Celsius to Fahrenheit and Fahrenheit to Celsius. */
import java.util.Scanner;
public class Temperature {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Celcius to Farenhite Conversion and vice versa==========");
        System.out.println("Enter the temperature in Celcius: ");
        double c = sc.nextDouble();
        double tf = (c*9/5)+32;
        System.out.println("The converted temperature in Farenhite is: " + tf);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Enter the temperature in Farenhite: ");
        double f = sc.nextDouble();
        double tc = (f-32)*5/9;
        System.out.println("The converted temperature in Celcius is: " + tc);
        System.out.println("====================================================================");
        sc.close();
    }
    
}
