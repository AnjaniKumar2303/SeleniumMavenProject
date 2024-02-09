package AccessPrivateMemberUsingReflection;

import AccessPrivateUsingReflection.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class  ReflectionClass {

    public static void main(String[] args) {

        try {

            Employee e = new Employee(10);
            Field f = Employee.class.getDeclaredField("id");
            f.setAccessible(true);
            int n = (int) f.get(e);
            System.out.println(n);

            Method method = Employee.class.getDeclaredMethod("getId");
            method.setAccessible(true);

            int m = (int) method.invoke(e);

            System.out.println(m);


        } catch(Exception e) {
            System.out.println(e);
        }



    }
}
