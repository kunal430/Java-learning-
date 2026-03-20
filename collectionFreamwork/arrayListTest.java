package collectionFreamwork;

import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(); // init array list
        students.add("kartik");
        students.add("nishant");                     // add function
        students.add("ritika");
        students.add("nilam");

        System.out.println("list 1 "+students);
        students.add(3, "kisan");       // add at index function
        System.out.println("list add new name at 3rd index= "+students);

        ArrayList<String> studentage = new ArrayList<>();  // new array list init
        studentage.add("15");
        studentage.add("12");
        studentage.add("23");
        studentage.add("24");

        System.out.println("list 2"+studentage);
        students.addAll(studentage);                     // joined 2 list using .addAll() function
        System.out.println("combined list "+students);   // printed combined list
    }
}
