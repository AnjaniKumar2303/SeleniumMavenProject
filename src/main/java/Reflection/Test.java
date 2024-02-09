package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {

        Class c = Class.forName("Reflection.Student");

        Constructor[] constructorArray = c.getDeclaredConstructors();

        for(Constructor constructor : constructorArray) {
            System.out.println(constructor);

        }

        Method[] m = c.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method);
        }




    }
}
