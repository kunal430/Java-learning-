package functions;

import java.util.Scanner;

public class func1 { 
    public static void printname(String name){ // creating a function
        System.out.println("Name from printNameFunc = "+name);
        return ;

    }
       public static void main (String[] args){ // getting user input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printname(name); // func to print name 
        sc.close();
    }
    
}
/*  */
