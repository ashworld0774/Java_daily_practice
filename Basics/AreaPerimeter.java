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
        System.out.println("=====================================================");

        System.out.println("============Area and Perimeter of Rectangle============");
        System.out.print("Enter the length and breadth of the rectangle: ");
        int l = sc.nextInt(), b = sc.nextInt();
        int rarea = l*b;
        int rper = 2*(l+b);

        System.out.println("The Area of the rectangle is :"+rarea+ "\nThe perimeter of the rectangle is: "+rper);
        System.out.println("=====================================================");

        sc.close();
    }
}
