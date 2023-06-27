package com.heliorodri.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final int AGE = 30;

    @Test
    void itShouldSetAllFieldsSuccessfully() {
        final Person expected = new Person(FIRST_NAME, LAST_NAME, AGE);
        final Person builderResult = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .build();

        assertEquals(expected.getFirstName(), builderResult.getFirstName());
        assertEquals(expected.getLastName(), builderResult.getLastName());
        assertEquals(expected.getAge(), builderResult.getAge());
    }

    @Test
    void itShouldNotSetDefaultValues() {
        final Person builderResult = new Person.Builder()
                .firstName("John")
                .build();

        assertEquals(FIRST_NAME, builderResult.getFirstName());
        assertNull(builderResult.getLastName());
        assertNull(builderResult.getAge());
    }

}