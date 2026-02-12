package patternQusetion;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    System.out.println("enter row = ");
    int row = sc.nextInt();
    System.out.println("enter column = ");
    int column = sc.nextInt();
    // outer loop
    for (int i = 0 ;i < row;i++){ 
        // inner loop
        for (int j = 0 ; j < column ; j ++){
            System.out.print("@");

        }
        System.out.println( );

    }
    sc.close();  
    }  
}
/*  o/p 
enter row = 
9
enter column = 
7
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
@@@@@@@
*/