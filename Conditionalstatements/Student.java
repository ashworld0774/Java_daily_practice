public class Student {
    public static void main(String[] args) 
    {
        int m1 = 45, m2 = 32, m3 = 22, m4 = 12;
        int total = m1+m2+m3+m4;
        int per = (total*100)/200;
        if (per >= 45)
            System.out.println("Student is passed");
        else 
            System.out.println("Student is failed");

    }
}
