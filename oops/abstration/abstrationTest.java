package oops.abstration;

abstract class bankAbstract {
    abstract public void accountype();
    public void branchName(){
        System.out.println("sangli");
    }
}

class shreeramFinance extends bankAbstract{

    public void accountype(){
        System.out.println("Loan account ");
    }

}
public class abstrationTest {
    public static void main(String[] args) {
        shreeramFinance siddharam = new shreeramFinance();
        siddharam.accountype();
        siddharam.branchName();
    }
}
