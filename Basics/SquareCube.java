import java.util.Scanner;
public class SquareCube {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ============= Square and cube ============");
        System.out.print("Enter the integer number: ");
        int a = sc.nextInt();

        int square = a*a;
        int cube = a*a*a;

        System.out.println("Square of the number is: "+square + "\nCube of the number: "+cube);
        System.out.println("===============================================");
        sc.close();
    }
}
