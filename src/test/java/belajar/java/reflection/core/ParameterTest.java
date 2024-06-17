package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

    @Test
    void testGetParameter() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name : " + parameter.getName());
                System.out.println("Parameter Type : " + parameter.getType());
            }
            System.out.println("===============");
        }
    }

    @Test
    void testInvokeMethodWithParam() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("arbi", "dwi");
        setFirstName.invoke(person, "wijaya");

        System.out.println(person.getFirstName());
    }
}
