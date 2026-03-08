package oops.inheritance.multi_level_inheriance;

class class1 {
   public void methodA(){
    System.out.println("classs A");
   }
    
}
class b extends class1{
    public void methodB(){
        System.out.println("extended from class a == class b");
    }
}

class c extends b{
    public void methodC(){
        System.out.println("extended from class b == class c");
    }
}
