package functions;

import java.util.Scanner;

public class func1 { 
    public static void printname(String name){ // creating functions
        System.out.println("Name from printNameFunc = "+name);
        return ;

    }

    public static void printMobileNo(int MobileNo){
        System.out.println("Mobile No from printMobileNoFunc = "+MobileNo);
        return ;
    }

    public static void printSalary(double salary ){
        System.out.println("Salary from PrintSalary = "+salary);
        return;
    }
       public static void main (String[] args){ // getting user input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int MobileNo = sc.nextInt();
        double salary = sc.nextDouble();

        printname(name);                       // func to print name , mobile no , salary
        printMobileNo(MobileNo);
        printSalary(salary);
        sc.close();
    }
    
}
/* o/p
gauri
987654321
10000
Name from printNameFunc = gauri
Mobile No from printMobileNoFunc = 987654321
Salary from PrintSalary 10000.0
 */
