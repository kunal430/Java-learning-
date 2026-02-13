package oopsExe;

public class Employe { // class created 
    String empName ;
    int empID;
    int empsalary;
    int empInsentive ;

    Employe(String n , int ID , int sal , int ins ){ // paramerterized construstor created 
        empName = n ;
        empID = ID ;
        empsalary = sal ;
        empInsentive = ins ;
    }

    void empTotal(){ // method created  
        System.out.println("Employe name = " + empName);
        System.out.println("Employe ID = " + empID);
        System.out.println("total is "+ (empsalary + empInsentive));
    }
}
class Employee { // class created  
    public static void main(String[] args) {
        Employe e1 = new Employe("kanak ", 12321, 20000, 230); // object for employee 1
        Employe e2 = new Employe("vinit", 334, 17000, 450); // object for employee 2
        e1.empTotal();
        System.out.println("--------xx------------");
        e2.empTotal();
    }
    
}
/* o/p Employe name = kanak 
Employe ID = 12321
total is 20230
--------xx------------
Employe name = vinit
Employe ID = 334
total is 17450
 */