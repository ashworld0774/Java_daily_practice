import java.util.Scanner;
public class StraightLine {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the coordinates (x1,y1)  x1=");
            double x1 = scan.nextDouble();
        System.out.print("y1=");
            double y1 = scan.nextDouble();
        System.out.print("Enter the coordinates (x2,y2)  x2=");
            double x2 = scan.nextDouble();
        System.out.print("y2 =");
            double y2 = scan.nextDouble();
        System.out.print("Enter the coordinates (x3,y3)  x3=");
            double x3 = scan.nextDouble();
        System.out.print("y3 =");
            double y3 = scan.nextDouble();

        double s1 = (y2 - y1)/(x2-x1);
        double s2 = (y3 - y2)/(x3-x2);

        if (s1==s2)
            System.out.println("All the three points lie on same line");
        else
            System.out.println("All the three points do not lie on same line");

        scan.close();


    }
}
