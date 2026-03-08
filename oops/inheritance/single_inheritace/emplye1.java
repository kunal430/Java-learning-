package oops.inheritance.single_inheritace;

class emplye1 {
    public void salary(){
        System.out.println("from employee class");
        System.out.println("emp salary");
    }
    
}
class hr extends emplye1{
    public void bonus(){
        System.out.println("from hr class");
        System.out.println("hr bonus");
    }
}
