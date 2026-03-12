package oops.polymorphism;
class Product{
   public String multiply(String a , String b){
    return a + b ;
   } 
   public int multiply(int a , int b ){
    return a * b ;
   }
   public int multiply(int a , int b , int c){
    return a * b  * c ;
   }
}
public class method_overloadingPOLY {
    public static void main(String[] args) {
        Product multyplyObj = new Product();
        System.out.println(multyplyObj.multiply("shradha ","arjun"));
        System.out.println(multyplyObj.multiply(2,3));
        System.out.println(multyplyObj.multiply(3,3,3));

       
    }
}

