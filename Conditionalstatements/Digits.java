//Check whether a number is a two-digit, three-digit or four-digit number.

import java.util.Scanner;


public class Digits {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ( 1 to 4 digits only) : ");
        int n = sc.nextInt();

        if (n>=0 && n<=99)
            System.out.println("It is a two digit number");
            else if (n>=100 && n<=999)
                System.out.println("It is a three digit number");
                    else if (n>=1000 && n<=9999)
                        System.out.println("It is a four digit number");
        else
            System.out.println("It is more than four digit number");
        sc.close();

    }
}
