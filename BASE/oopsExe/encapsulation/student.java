package oopsExe.encapsulation;

public class student {

    // private variables (encapsulation)
    private String name;
    private int age;
    private String schoolName;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // getter for school name
    public String getSchoolName() {
        return schoolName;
    }

    // setter for school name
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // method to print age
    void ageInfo() {
        System.out.println("Age is = " + age);
    }

    // method to print student info
    void studInfo() {
        System.out.println(name + " is studying in " + schoolName);
    }
}