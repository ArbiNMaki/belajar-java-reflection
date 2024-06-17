package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Person;
import belajar.java.reflection.core.validation.Validator;
import org.junit.jupiter.api.Test;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person = new Person("Arbi", " ");
        Validator.validateNotBlank(person);
    }
}
