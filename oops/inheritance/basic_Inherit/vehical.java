package oops.inheritance.basic_Inherit;

 class vehical{
     int milage ;
     String color ;
     int price ;

     public void display(){
        System.out.println("-----------x----------");
        System.out.println("from vehical class");
        System.out.println("milage is = "+milage+"kmpl");
        System.out.println("color is = "+color);
        System.out.println("price is = "+price);
        System.out.println("-----------x----------");
     }
}
class car extends vehical{
    String name ;
    Boolean issunroof ;
    String fuletype ;

    public void show(){
        System.out.println("-----------x----------");
        System.out.println("from car classs");
        System.out.println("name = "+name);
        System.out.println("sunroof = "+issunroof);
        System.out.println("fule = " +fuletype);
        System.out.println("-----------x----------");

    }
}