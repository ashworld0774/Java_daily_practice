import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("============Area and Perimeter of Square============");
        System.out.print("Enter the side of the square: ");
        int s = sc.nextInt();
        int sarea = s*s;
        int sper = 4*s;

        System.out.println("The Area of the sqaure is :"+sarea+ "\nThe perimeter of the square is: "+sper);
        System.out.println("Ther diagonal of the square is: " + s*Math.sqrt(2));
        System.out.println("=====================================================");

        System.out.println("============Area and Perimeter of Rectangle============");
        System.out.print("Enter the length and breadth of the rectangle: ");
        int l = sc.nextInt(), b = sc.nextInt();
        int rarea = l*b;
        int rper = 2*(l+b);

        System.out.println("The Area of the rectangle is :"+rarea+ "\nThe perimeter of the rectangle is: "+rper);
        System.out.println("The diagonal of the rectangle : " +Math.sqrt(l*l+b*b) );
        System.out.println("=====================================================");

        System.out.println("============Area of triangle============");
        System.out.print("Enter the base and height of the triangle: ");
        double bs = sc.nextInt(), h = sc.nextInt();
        double tarea = 0.5*bs*h;

        System.out.println("The Area of the triangle is :"+tarea);
        System.out.println("=====================================================");

        sc.close();
    }
}
