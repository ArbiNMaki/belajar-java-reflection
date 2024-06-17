package belajar.java.reflection.core.data;

import belajar.java.reflection.core.annotation.NotBlank;

import java.io.Serializable;

public class Person implements Nameable, Serializable {

    @NotBlank
    private String firstName;

    @NotBlank(allowEmptyString = true)
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
