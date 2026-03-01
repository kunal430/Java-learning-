package DataTypeConversion;

public class ImpliciitConversion {
    public static void main(String[] args) {
        int a= 100;
        System.out.println("integer datatype :"+a);

        //convertion ot long
        long f = a;
        System.out.println("long datatype :"+f);

        //convertion to double
        float d = f ;
        System.out.println("float datatyppe :"+d);
    }
    
}
// implicit convesion = convert smaller data type to larger data type (Widening)
//order of conversion int -long - float