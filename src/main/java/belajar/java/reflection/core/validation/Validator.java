package belajar.java.reflection.core.validation;

import belajar.java.reflection.core.annotation.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {
        // Get Class
        Class<?> aClass = object.getClass();

        // Get All Fields
        Field[] fields = aClass.getDeclaredFields();

        // Iterate Each Field
        for (Field field : fields) {
            // Get Not Blank Annotation
            NotBlank notBlank = field.getAnnotation(NotBlank.class);

            // check if @NotBlank is exists
            if (notBlank != null) {
                // Get Field Value
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (notBlank.allowEmptyString()) {
                    // allow empty string
                    // ignore
                } else {
                    // not allow empty string
                    value = value.trim();
                }

                // check if value is empty string
                if ("".equals(value)) {
                    // throw error
                    throw new RuntimeException(field.getName() + " must not blank");
                }

            }
        }
    }
}
