import java.util.Scanner;
public class Circle {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("----------Area and Circumference of a circle ---------");
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double area = 3.14*r*r;
        double circum = 2*3.14*r;

        System.out.println("The Area of the circle is: "+area+ "\nThe circumference of the circle is: "+circum);

        System.out.println("-------------------------------------------------------");
        sc.close();
    }
}
