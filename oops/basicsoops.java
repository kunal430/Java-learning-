package oops;

class Student{
    String name ;
    String age ;
    public void atendence(){
        System.out.println("atended");
        System.out.println(this.name);
        System.out.println(this.age);
    } 
}

public class basicsoops {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name="kunal";
        s1.age="24";
        s1.atendence();
    }
   


    
}
