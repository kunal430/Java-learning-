package oopsExe.encapsulation;

public class student {

    private String name ;
    //gatter for name 

    public String getName(){
        return name;
    }

    //setter for age
    public void setAge(String name){
        this.name = name;


    private String school_name;


    private int age ;

    //gatter for age 

    public int getAge(){
        return age;
    }

    //setter for age
    public void setAge(int age){
        this.age = age;
    }

    void age_info(){
        System.out.println("age is = "+age);
    }
    

    void stud_info(){
        System.out.println(getName()+"is studying in "+ school_name);
    }

    
}
