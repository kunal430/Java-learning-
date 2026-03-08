package oops.super_keyword;

class superOne{
    String name = "i am veriable of perent class";
    void printMethod(){
        System.out.println("i am method of parent class");
    }
     superOne(){
        System.out.println("i am constructor of perant class");
    }
}

class superTwo extends superOne{
    String name = "i am veriable of child class";
    void printMethod(){
        System.out.println("i am method of child class ");
    }
    superTwo(){
        System.out.println("print constructor of child class-");
        System.out.println("i am constructor of child class");
        System.out.println("print constructor of perent class-");
        super();
    }

    void printveriable(){
        System.out.println("print veriable of child class- "+ name);
        System.out.println("print verible of perent class- "+super.name); 
    }
    void printMethods(){
        System.out.println("print method of child class -");
        printMethod();
        System.out.println("print method of perent class -");
        super.printMethod();
    }
}
public class testclassSuper {
    public static void main(String[] args) {
        superTwo sTwo = new superTwo();
        sTwo.printveriable();
        sTwo.printMethods();
        
    }
    
}
