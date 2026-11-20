/*Question: Write a Java program to calculate the time taken to travel a given distance at a specified speed. */


import java.util.Scanner;

class Speed {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter speed (km/hr): ");
        double speed = sc.nextDouble();

        double time = distance / speed;

        System.out.println("Time taken = " + time + " hours");
        sc.close();
    }
}
