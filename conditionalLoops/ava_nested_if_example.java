package conditionalLoops;
import java.util.*;

public class ava_nested_if_example{
    public static void main (String[] args){
    Scanner sc= new Scanner(System.in); 
    System.out.println("enter your name =");
    String name = sc.next();
    System.out.println("enter your age =");
    int age = sc.nextInt();
    System.out.println("enter your waight= ");
    int waight = sc.nextInt();
    //outer loop
    if(age>18){
        //inner loop
        if(waight>50){
            System.out.println(name+ " you are eligible to donet blood");
        }
    }
    sc.close();
    }
}

//this code ask name age and waight
//based on given info it decides and generate output 
//concept used = nested if , user-input 
//suppose name = naredra
//        age = 75 
//        waight = 78 
// OUTPUT : 
//enter your name =
//narendra
//enter your age =
//75
//enter your waight= 
//78
//narendra you are eligible to donet blood