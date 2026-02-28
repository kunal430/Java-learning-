package oopsExe.encapsulation;

import java.util.Scanner;

public class stud_obj {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        student stud1 = new student();

        // setting values using setters
        System.out.print("Enter name: ");
        stud1.setName(sc.nextLine());

        System.out.print("Enter age: ");
        stud1.setAge(sc.nextInt());

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter school name: ");
        stud1.setSchoolName(sc.nextLine());

        // calling methods
        stud1.studInfo();
        stud1.ageInfo();

        sc.close();
    }
}