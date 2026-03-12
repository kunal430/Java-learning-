package oops.methodOverriding;
class Bankinfo{
    public void rateOfIntrest(){
        System.out.println("general rate of intresrt 5%");
    }
}
class BankOfBaroda extends Bankinfo{
    @Override
    public void rateOfIntrest(){
       System.out.println("Bank of Baroda rate of intresrt 8%");
    }
}
class BankOfIndia extends Bankinfo{
    @Override
    public void rateOfIntrest(){
        System.out.println("Bank of India rate of intresrt 8.5%");
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        Bankinfo bankin = new Bankinfo();
        bankin.rateOfIntrest();
        BankOfBaroda bob = new BankOfBaroda();
        bob.rateOfIntrest();
        BankOfIndia boi = new BankOfIndia();
        boi.rateOfIntrest();
    }
}
