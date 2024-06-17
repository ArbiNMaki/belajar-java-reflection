package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    @Test
    void testArrayClass() {
        Class<String[]> stringArrayClass = String[].class;
        Class<int[]> intArrayClass = int[].class;
        Class<Person> personClass = Person.class;

        System.out.println(stringArrayClass.isArray());
        System.out.println(intArrayClass.isArray());
        System.out.println(personClass.isArray());
    }

    @Test
    void testArrayMember() {
        Class<String[]> stringArrayClass = String[].class;

        System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
        System.out.println(stringArrayClass.getComponentType());
    }

    @Test
    void testArrayManipulate() {
        Class<String[]> stringArrayClass = String[].class;

        Object array = Array.newInstance(stringArrayClass.getComponentType(), 10);

        Array.set(array, 0, "Arbi");
        Array.set(array, 1, "Kalista");

        System.out.println(Array.get(array, 0));
        System.out.println(Array.get(array, 1));
    }
}
