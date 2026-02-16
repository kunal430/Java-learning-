package functions;

import java.util.Scanner;

public class productTwoNum {
    public static int multiply(int a , int b){
        return a* b ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();

        System.out.println("product of a and b = "+multiply(a,b));
        sc.close();
    }
    
}


