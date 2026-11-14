import java.util.Scanner;
public class HeronsFormula {
    public static void main(String [] args){ 
    Scanner sc = new Scanner (System.in);
    System.out.println("===========Area of triangle using Heron's formula============");
    System.out.println("Enter the sides of the triangle: ");
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    double s = (a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("The area of the triangle is: " + area);
    System.out.println("==============================================================");
    sc.close();
    }
}
