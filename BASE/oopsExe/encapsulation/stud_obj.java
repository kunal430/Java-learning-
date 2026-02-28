package oopsExe.encapsulation;

import java.util.Scanner;

public class stud_obj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student stud1 = new student();
        System.out.println("enter name = ");
        stud1.name= sc.next();
        System.out.println("enter age = ");
        stud1.age=sc.nextInt();
        System.out.println("enter school name = ");
        stud1.school_name=sc.nextLine();

        stud1.stud_info();
        stud1.age_info();

        sc.close();
    }
    
}
