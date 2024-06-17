package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Gender;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EnumTest {

    @Test
    void name() {
        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.isEnum());
        System.out.println(genderClass.getSuperclass());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
    }
}
