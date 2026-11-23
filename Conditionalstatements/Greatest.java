public class Greatest {
    public static void main(String[] args) {
        
        int a = 34, b = 45, c = 3;

        if (a >= b && a >= c) {
            System.out.println("a is the eldest one");
        }
        else if (b >= a && b >= c) {
            System.out.println("b is the eldest one");
        }
        else {
            System.out.println("c is the eldest one");
        }
    }
}