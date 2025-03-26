package operator;

public class testbitwise{
    public static void main(String[] args) {
        int a= 30; // declaring values
        int b= 10;
        int c= 0;
        System.out.println("bitwise operator\n");

        c= a & b ;
        System.out.println("a & b -" +c);

        c=a|b;
        System.out.println("a | b -"+c);

    }
}