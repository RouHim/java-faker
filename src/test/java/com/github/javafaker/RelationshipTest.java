package com.github.javafaker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class RelationshipTest extends AbstractFakerTest {

    private Faker mockFaker;

    @BeforeEach
    public void before() {
        super.before();
        mockFaker = Mockito.mock(Faker.class);
    }

    @Test
    public void anyTest() {
        assertThat(faker.relationships().any(), not(isEmptyOrNullString()));
    }

    @Test
    public void directTest() {
        assertThat(faker.relationships().direct(), not(isEmptyOrNullString()));
    }

    @Test
    public void extendedTest() {
        assertThat(faker.relationships().extended(), not(isEmptyOrNullString()));
    }

    @Test
    public void inLawTest() {
        assertThat(faker.relationships().inLaw(), not(isEmptyOrNullString()));
    }

    @Test
    public void spouseTest() {
        assertThat(faker.relationships().spouse(), not(isEmptyOrNullString()));
    }

    @Test
    public void parentTest() {
        assertThat(faker.relationships().parent(), not(isEmptyOrNullString()));
    }

    @Test
    public void siblingTest() {
        assertThat(faker.relationships().sibling(), not(isEmptyOrNullString()));
    }

    @Test
    public void anyWithIllegalArgumentExceptionThrown() {
        when(mockFaker.random()).thenThrow(new IllegalArgumentException());
        Executable executable = () -> new Relationships(mockFaker).any();
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    public void anyWithSecurityExceptionThrown() {
        when(mockFaker.random()).thenThrow(new SecurityException());
        Executable executable = () -> new Relationships(mockFaker).any();
        assertThrows(RuntimeException.class, executable);
    }
}