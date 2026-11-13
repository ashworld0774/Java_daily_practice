/* Input five numbers and print the sum and the average */
import java.util.Scanner;
public class SumAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Sum and Average =====");
        System.out.println("Enter the five numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble();

        double sum = a+b+c+d+e;
        double average = sum/5;

        System.out.println("Sum of all five numbers is: " +sum + "\nAverage of all five numbers is: "+average);
        System.out.println("===========================");
        sc.close();
    }
}
