package conditionalStatements;
import java.util.*;
public class if_statement_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println(name+" you are eligible get Driving License GO GET A DRIVING LICENCE");
        }
        sc.close();
    }
}
//this code ask name and age 
//based on given info it decides and generate output 
//concept used = if statement , user-input 
//suppose name = amit
//        age = 35
// OUTPUT : 
//enter your name 
//amit
//enter your age 
//35
//narendra you are eligible get Driving License GO GET A DRIVING LICENCE