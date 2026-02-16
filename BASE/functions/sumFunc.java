package functions;

import java.util.Scanner;

public class sumFunc {
    public static int addition(int a , int b){
        int sum = a+b ;
        return sum ;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();
                
        System.out.println("sum of a and b is = "+ addition(a, b));
        sc.close();
    }
}
