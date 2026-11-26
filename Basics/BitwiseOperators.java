public class BitwiseOperators {
    public static void main (String[] args){      
        int i=5;
        int x=++i + i++;
        int y=i++ + x + ++i - x + 4;
        int z=x + y + i++ + i++ + ++i;
        System.out.println(i);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        
        int A=25, B=39;
        int C= A&B;

        System.out.println("A&B:" +C);
        int D=A|B;
        System.out.println("A|B: " +D);

        int E = A^B;
        System.out.println("A^B: " +E);

        A = A<<1;
        B = B>>1;
        System.out.println("A<<1: "+A);
        System.out.println("B>>1: "+B);
}

}
