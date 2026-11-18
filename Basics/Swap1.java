public class Swap1 {
    public static void main(String [] args)
    {
        System.out.println("=======Swapping using third variable========");
        int a = 20;
        int b = 10;
        System.out.println("Before Swapping the value of a is "+a+ " and of b is "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping the value of a is "+a+ " and of b is "+b);
    }
}
