/*Q3. Write a Java program to perform the following time conversions:
- Hours into minutes and seconds.
- Seconds into hours, minutes, and remaining seconds. 
- Kilograms into grams.
- Grams into kilograms.
- Inches into centimeters.
- Feet into meters.*/
import java.util.Scanner;
public class Conversions {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("            Basic Conversions           ");
        System.out.println("-----------------------------------------");
        System.out.print("Enter the time in hours: ");
        double hr = sc.nextDouble();
        System.out.println("Time in minutes is: "+hr*60+" min and in seconds is: "+hr*3600+" sec");
        System.out.println("------------------------------------------");

        System.out.print("Enter the time in seconds: ");
        double sec = sc.nextDouble();
        System.out.println("Time in minutes is: "+sec/60+" min and in hours is: "+sec/3600+" hrs");
        System.out.println("The remaining seconds are: "+sec%60);
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        System.out.print("Enter the weight in kilograms: ");
        double kg = sc.nextDouble();
        System.out.println("The converted weight in grams: "+kg*1000+ " g");
        System.out.println("------------------------------------------");
        System.out.print("Enter the weight in grams: ");
        double g = sc.nextDouble();
        System.out.println("The converted weight in grams: "+g/1000+ " kg");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        System.out.print("Enter the length in inches: ");
        double inch = sc.nextDouble();
        System.out.println("The converted length in centimeters: "+inch*2.54+ " cm");
        System.out.println("------------------------------------------");
        System.out.print("Enter the length in feet: ");
        double feet = sc.nextDouble();
        System.out.println("The converted length in meters: "+feet*0.3048+ " m");
        System.out.println("------------------------------------------");

        sc.close();

    }
}
