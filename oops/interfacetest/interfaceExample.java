package oops.interfacetest;
interface car{ // interface
    public void start(); // decleared mentod 
}

class petrolcar implements car {
    public void start(){
        System.out.println("petrol car started"); // body of declared method for petrol car class 
    }
}
class dieselcar implements car{
    public void start(){
        System.out.println("diesel car started");
    }
}
public class interfaceExample {
    public static void main(String[] args) {
        car SkodaSlaviaPetrol = new petrolcar();
        SkodaSlaviaPetrol.start();

        car MahindraTharDiesel = new dieselcar();
        MahindraTharDiesel.start();
    }
    
}
 
/*

o/p

petrol car started
diesel car started

*/