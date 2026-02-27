package exceptionHandling;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no : "); // user input
        int a = sc.nextInt();
         System.out.println("enter 2nd no : ");
        int b = sc.nextInt();
        

        try{                     // try block == it will try to run 
            int answer = a/b ;
            System.out.println("answer if no error occurd  : "+answer);
        }catch(ArithmeticException e){    // catch block == it will get that error massage and store it into e
            System.out.println(e.getMessage());  // printing that massage stored in e 
        
        }

        sc.close();
    }
}

/*
if 
 input == 10 / 0 

the exception msg will

= / by zero =

*/

