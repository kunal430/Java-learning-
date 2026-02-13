package oopsExe;

public class Employe {
    String empName ;
    int empID;
    int empsalary;
    int empInsentive ;
    //int total = empsalary + empInsentive ;

    Employe(String n , int ID , int sal , int ins ){
        empName = n ;
        empID = ID ;
        empsalary = sal ;
        empInsentive = ins ;
    }

    void empTotal(){
        System.out.println("Employe name = " + empName);
        System.out.println("Employe ID = " + empID);
        System.out.println("total is "+ (empsalary + empInsentive));
    }
}
class Employee {
    public static void main(String[] args) {
        Employe e1 = new Employe("kanak ", 12321, 20000, 230);
        e1.empTotal();
    }

    
}