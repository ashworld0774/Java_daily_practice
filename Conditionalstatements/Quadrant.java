import java.util.Scanner;
public class Quadrant {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the coordinate of x");
        int x = sc.nextInt();
        System.out.print("Enter the coordinate of y");
        int y = sc.nextInt();

        if(x>0&&y>0)
            System.out.println("The coordinates are in 1st quadrant");
        else if(x>0&&y<0)
            System.out.println("The coordinates are in 2nd quadrant");
        else if(x<0&&y>0)
            System.out.println("The coordinates are in 3rd quadrant");
        else if(x<0&&y<0)
            System.out.println("The coordinates are in 4ht quadrant");
        else
            System.out.println("Check the coordinates and try again");

        sc.close();
        }
}
