import java.util.Scanner;
public class StudentsMarks {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the marks of all 5 subjects: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble();
        
        double sum = a+b+c+d+e;
        double percentage = (sum/500)*100;

        System.out.println("Your percentage is " +percentage);

        sc.close();
    }
}
