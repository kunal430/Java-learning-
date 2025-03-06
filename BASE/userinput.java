import java.util.*;
public class userinput{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("you enterd - "+name);
        sc.close();
    }    
}
