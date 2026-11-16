/*Write a Java program to convert distance:
- Kilometres into meters and centimeters.
- Meters into kilometres. */
import java.util.Scanner;
public class KmToMeter{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("        Km to Meter         ");
        System.out.println("----------------------------");
        System.out.print("Enter the distance in Km: ");
        double km = sc.nextDouble();
        System.out.println("The converted distance into meter: "+km*1000+" m");
        System.out.println("The converted distance into centimeter: "+km*100000 + " cm");

        System.out.println("----------------------------");
        System.out.print("Enter the distance in meters: ");
        double m = sc.nextDouble();
        System.out.println("The converted distance into kilometer: "+m/1000 + " km");
        System.out.println("==============================================");

        sc.close();
    }
}