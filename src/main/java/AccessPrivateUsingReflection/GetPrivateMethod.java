package AccessPrivateUsingReflection;

import java.lang.reflect.Method;

public class GetPrivateMethod {

    public static void main(String[] args) {

        try {

            Student e = new Student(10, "Mohan");

            Method method = e.getClass().getDeclaredMethod("getAge");

            method.setAccessible(true);

            int age = (int) method.invoke(e);

            System.out.println(age);




        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
