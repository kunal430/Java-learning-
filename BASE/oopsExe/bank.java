package oopsExe;

public class bank { 
    String name;
    int accountNo ;
    int accountBalance ;

    // construtor with parameter

    bank(String n , int accn ,int accbal ){
        name = n ;
        accountNo = accn ;
        accountBalance = accbal ;
    }
    // default constructor 
    bank(){
        name = "unknown";
        accountNo = 0 ;
        accountBalance = 0;
    }
    void Knowbalance(){
        System.out.println(name + " your account no "+accountNo + " with balance "+accountBalance);
    }   
}
class bankbalance{
    public static void main(String[] args) {
        bank b1 = new bank();
        bank b2 = new bank();
        b1.name ="saransh";
        b1.accountBalance = 234 ;
        b1.accountNo=342;
        b1.Knowbalance();
        b2.Knowbalance();
    }
    
}
