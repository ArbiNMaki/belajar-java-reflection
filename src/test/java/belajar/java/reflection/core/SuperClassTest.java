package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import org.junit.jupiter.api.Test;

public class SuperClassTest {

    @Test
    void testGetSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> objectClass = personClass.getSuperclass();
        System.out.println(objectClass);

        Class<? super Person> nullClass = objectClass.getSuperclass();
        System.out.println(nullClass);
    }
}
