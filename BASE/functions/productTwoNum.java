package functions;

import java.util.Scanner;

public class productTwoNum {
    public static int multiply(int a , int b){ // create sum function
        return a* b ; // without veriable
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");  // // getting user input 
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();

        System.out.println("product of a and b = "+multiply(a,b)); //  func to multiply 2 numbers
        sc.close();
    }
    
}

/* o/p 
enter a = 
88 
enter b = 
10
product of a and b = 880
 */
