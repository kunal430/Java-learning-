class hdfcBank{
    private String name ;
    private int age ;
    private String Address ;

    public String getname(){
        return name ;
    }
    public int getage(){
        return age ;
    }
    public String getAddress(){
        return Address ;
    }

    public void setname(String name){
        this.name = name ;
    }
    public void setage(int age){
        this.age= age;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
}
public class encapsulationTest {
    public static void main(String[] args) {
        hdfcBank client1= new hdfcBank();
        client1.setname("siddhart");
        client1.setage(29);
        client1.setAddress("kolhapur");
        System.out.println("client name - "+client1.getname());
        System.out.println("client addreaa - "+client1.getAddress());
        System.out.println("client age - "+client1.getage());
    }
    
}
