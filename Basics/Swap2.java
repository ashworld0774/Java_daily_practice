public class Swap2 {
    public static void main (String [] args)
    {
        System.out.println("============Swapping without third variable==============");
        int a = 20;
        int b = 10;
        System.out.println("Before Swapping the value of a is "+a+" and of b is "+b);

        a = a+b;
        b = a-b;
        a = a - b;

        System.out.println("After Swapping the value of a is "+a+" and of b is "+b);
    }
    
}
