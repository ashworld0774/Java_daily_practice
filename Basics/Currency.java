import java.util.Scanner;
public class Currency
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        int n500 = amount/500;
        amount = amount%500;

        int n200 = amount/200;
        amount = amount%200 ;

        int n100 = amount/100;
        amount = amount%100;

        int n50 = amount/50;
        amount = amount%50;
    

        System.out.println("In the given amount there are \n" +n500+" notes of 500 \n"+n200+" notes of 200 \n"+n100+" notes of 100 \n"+n50 + " notes of 50");

        sc.close();
        
    }
}