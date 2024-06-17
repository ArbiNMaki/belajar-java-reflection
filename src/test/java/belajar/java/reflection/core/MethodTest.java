package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {

    @Test
    void testGetMethod() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("==========================");
        }
    }

    @Test
    void testGetMethodValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method getFirstName = personClass.getDeclaredMethod("getFirstName");

        Person person = new Person("Maki", "Katsuki");
        String firstName = (String) getFirstName.invoke(person);
        System.out.println(firstName);
    }
}
