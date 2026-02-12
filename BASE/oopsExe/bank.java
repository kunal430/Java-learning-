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
        System.out.println("parameterized construter called =");
        b1.Knowbalance();
        System.out.println("default constructor called =");
        b2.Knowbalance();
    }
    
}
// o/p
//parameterized construter called =
//saransh your account no 342 with balance 234
//default constructor called =
//unknown your account no 0 with balance 0