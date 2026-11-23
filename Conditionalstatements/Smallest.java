public class Smallest {
    public static void main(String[] args) {
        
        int a = 34, b = 34, c = 3;

        if (a <= b && a <= c) {
            System.out.println("a is the smallest");
        }
        else if (b <= a && b <= c) {
            System.out.println("b is the smallest");
        }
        else {
            System.out.println("c is the smallest");
        }
    }
}