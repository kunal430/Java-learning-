package conditionalStatements ;
import java.util.*;
 class if_else_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();
        System.out.println("enter your age ");
        int age = sc.nextInt();
    if (age > 18){
        System.out.println(name+"are eligible for voting");  
    }else{
        System.out.println(name+"you are not eligible for vote");
    }
    sc.close();
   } 
}
//this code ask name age 
//based on given info it decides and generate output 
//concept used = if-else , user-input 
//suppose name = naredra 
//        age = 75 
// OUTPUT : 
//enter your name 
//narendra
//enter your age 
//75
//narendra you are eligible for voting 