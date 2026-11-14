/*
Calculate the distance between two coordinates. 
Calculate the midpoint between two coordinates. 
 */

import java.util.Scanner;
public class CoordinatesDistance {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("=============Distance between Two points and its midpoint=================");
        System.out.println("Enter the coordinates of point A (x1, y1): ");
        double x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.println("Enter the coordinates of point B (x2, y2)");
        double x2 = sc.nextInt(), y2 = sc.nextInt();

        double dist = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        double midofx= ((x1+x2)/2);
        double midofy= ((y1+y2)/2);

        System.out.println("The distance between the points A and B is: " + dist);
        System.out.println("The midpoint is (" + midofx + " , " + midofy+ ")");

        sc.close();
    }
}
