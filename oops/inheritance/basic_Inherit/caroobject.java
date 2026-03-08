package oops.inheritance.basic_Inherit;

public class caroobject {
    public static void main(String[] args) {
        car car1 = new car();
        car1.color="white";
        car1.fuletype="diesel";
        car1.issunroof=true;
        car1.milage=12;
        car1.name="nexon";
        car1.price=2000000;
        car1.display();
        car1.show();
    }
    
}
/*
o/p
-----------x----------
from vehical class
milage is = 12kmpl
color is = white
price is = 2000000
-----------x----------
-----------x----------
from car classs
name = nexon
sunroof = true
fule = diesel
-----------x----------

*/