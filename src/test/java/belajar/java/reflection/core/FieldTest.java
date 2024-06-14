package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testGetField() {
        Class<Person> personClass = Person.class;

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field field = personClass.getDeclaredField("firstName");
        field.setAccessible(true);

        Person person1 = new Person("Arbi", "Dwi Wijaya");
        String result = (String) field.get(person1);
        System.out.println(result);
    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field field = personClass.getDeclaredField("firstName");
        field.setAccessible(true);

        Person person1 = new Person("Arbi", "Dwi Wijaya");
        field.set(person1, "Kalista");
        System.out.println(person1.getFirstName());
    }
}
