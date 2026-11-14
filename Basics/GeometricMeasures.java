import java.util.Scanner;
public class GeometricMeasures {
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("==========Geometric Measures==========");
    System.out.print("Enter the side of cube: ");
    int a = sc.nextInt();
    System.out.println("The Volume of cube: "+ a*a*a + "\nThe total surface area: " + 6*a*a);
    System.out.println("---------------------------------------");

    System.out.print("Enter the length, breadth, height of cuboid: ");
    int l = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
    System.out.println("The Volume of cuboid "+ l*b*h + "\nThe total surface area: " + 2*(l*b+b*h+h*l));
    System.out.println("---------------------------------------");

    System.out.print("Enter the radius of the sphere: ");
    int r = sc.nextInt();
    System.out.println("The Volume of sphere: "+ 4/3*3.14*r*r*r + "\nThe total surface area: " + 4*3.14*r*r);
    System.out.println("---------------------------------------");

    System.out.print("Enter the radius of the cylinder: ");
    int r1 = sc.nextInt();
    System.out.print("Enter the height of the cylinder: ");
    int h1 = sc.nextInt();
    System.out.println("The Volume of cylinder: "+ 3.14*r1*r1*h1 + "\nThe total surface area: " + 2*3.14*r1*(h1+r1));
    System.out.println("---------------------------------------");  
    sc.close();  
}


}
