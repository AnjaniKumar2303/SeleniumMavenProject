package AccessPrivateUsingReflection;

import java.lang.reflect.Field;

public class GetPrivateField {
    public static void main(String[] args) {

        try {

            Student s = new Student(10, "Mohan");

            Field f = s.getClass().getField("age");

            f.setAccessible(true);

            int age = (int) f.get(s);

            System.out.println(age);

        } catch (Exception e) {
            System.out.println(e);
        }



    }
}
