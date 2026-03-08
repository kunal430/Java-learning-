package oops.inheritance.hirarchical;
class a {
    public void printinfo(){
      System.out.println("class a method");
    }
}
class b extends a {
    public void printB(){
        System.out.println("class b method");
    }
}
class c extends a {
    public void printC(){
        System.out.println("classs c method");
    }
}
public class hirarchicalexample {
    public static void main(String[] args) {
        b Bobject = new b();
        Bobject.printinfo();
        c Cobject = new c();
        Cobject.printinfo();
    }
}
