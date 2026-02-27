package exceptionHandling;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no : ");
        int a = sc.nextInt();
         System.out.println("enter 2nd no : ");
        int b = sc.nextInt();
        

        try{
            int answer = a/b ;
            System.out.println("answer if no error occurd  : "+answer);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        
        }

        sc.close();
    }
}

