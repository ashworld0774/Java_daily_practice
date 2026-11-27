import java.util.Scanner;
public class Axis {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the coordinates x, y, z: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

        if(x==0&&y==0)
            System.out.println("The coordinates exists on Z-Axis");
        else if(y==0&&z==0)
            System.out.println("The coordinates exists on X-Axis");
        else if(z==0&&x==0)
            System.out.println("The coordinates exists on Y-Axis");
        else if(x==0)
            System.out.println("The coordinates exists on YZ plane");
        else if(y==0)
            System.out.println("The coordinates exists on XZ plane");
        else if(z==0)
            System.out.println("The coordinates exists on XY plane");
        else
            System.out.println("Check the coordinates and try again");

        sc.close();
        }
}
