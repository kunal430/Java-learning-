package DataTypeConversion;

public class ExplicitConversion {
    public static void main(String[] args) {
        double d = 100.50;
        System.out.println("double datatype : "+d);

        //convertion to long

        long l = (long)d;
        System.out.println("long datatype : "+l);

        // coversion to float;
        float f = (float)l;
        System.out.println("float datatype : "+f);

        // conversion to int
        int a = (int)f;
        System.out.println("integer datatype : "+a);
      
    }
}




// Explicit convesion = convert larger data type to smaller data type (nerrowing)
//order of conversion double -long - float - int 