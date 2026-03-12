package oops.methodOverloading;

public class methodOverloading{
    public static String sum(String x , String y){
    return x + y ; 
    }
    public static int sum (int a , int b ){
    return a + b ;
    }
    public static int sum (int a , int b , int c){
    return a + b + c ;
    }

    
    public static void main(String[] args) {
        System.out.println("function to add Strings "+sum("kanak ","sharma"));
        System.out.println("function add 2 num"+sum(2,3));
        System.out.println("function add 3 num"+sum(2,3,4));
    }

}