package oops.inheritance.multipleInheritance_using_inheritance;

interface testA{
    public void show();
}

interface testB{
    public void show();
}

class testC implements testA , testB{
    public void show(){
        System.out.println("class c implements class a and class b");
    }
}
public class multiple_inheritace {
    public static void main(String[] args) {
        testC Cobj =new testC();
        Cobj.show();

    }
    
}

/*

o/p
class c implements class a and class b

*/
