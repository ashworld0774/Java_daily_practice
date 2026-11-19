import java.util.Scanner;
public class FirstLastDigits {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("==========================================================");
        System.out.print("Enter the five digit number : ");
        int num = sc.nextInt();
        System.out.println("-----------The first digit of the number ------------------");
        System.out.println(num/10000);

        System.out.println("------------The last digit of the number-------------------");
        System.out.println(num%10);

        System.out.println("==========================================================");

        sc.close();
    }
}
