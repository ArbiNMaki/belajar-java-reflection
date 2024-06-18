package belajar.java.reflection.core;

import belajar.java.reflection.core.data.Product;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {

    @Test
    void testClassRecord() {
        Class<Product> productClass = Product.class;

        System.out.println(productClass.isRecord());
        System.out.println(Arrays.toString(productClass.getDeclaredFields()));
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(productClass.getRecordComponents()));
    }

    @Test
    void testGetRecordValueByComponent() throws InvocationTargetException, IllegalAccessException {
        Product product = new Product("1", "iPhone", 20_000_000L);

        Class<Product> productClass = Product.class;
        RecordComponent component = Arrays.stream(productClass.getRecordComponents())
                .filter(recordComponent -> recordComponent.getName().equals("id"))
                .findFirst().get();
        Method method = component.getAccessor();

        System.out.println(method.invoke(product));
    }
}
