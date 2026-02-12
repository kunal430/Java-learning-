package conditionalStatements;

import java.util.Scanner;

public class switchStatemenet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("pressed 1");
            break;
            case 2 : System.out.println("pressed 2");
            break ;
            case 3 : System.out.println("pressed 3");
            break ;
            default:System.out.println("invalid input");
                break;
        }sc.close();
    }
}