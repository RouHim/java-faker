package com.github.javafaker.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;


public class FakeValuesTest {

    private static final String PATH = "address";
    private FakeValues fakeValues;

    @BeforeEach
    public void before() {
        fakeValues = new FakeValues(Locale.ENGLISH, "address.yml", PATH);
    }

    @Test
    public void supportsPathIsTrueWithTheSameValueAsThePath() {
        assertThat(fakeValues.supportsPath(PATH), is(true));
    }

    @Test
    public void supportsPathIsFalseWhenValueIsNotTheSame() {
        assertThat(fakeValues.supportsPath("dog"), is(false));
    }

    @Test
    public void getAValueReturnsAValue() {
        assertThat(fakeValues.get(PATH), is(notNullValue()));
    }

    @Test
    public void getAValueDoesNotReturnAValue() {
        assertThat(fakeValues.get("dog"), is(nullValue()));
    }

    @Test
    public void getAValueWithANonEnglishFile() {
        FakeValues frenchFakeValues = new FakeValues(Locale.FRENCH);
        assertThat(frenchFakeValues.get(PATH), is(notNullValue()));
    }

    @Test
    public void getAValueForHebrewLocale() {
        FakeValues hebrew = new FakeValues(new Locale("iw"));
        assertThat(hebrew.get(PATH), is(notNullValue()));
    }

    @Test
    public void getAValueFromALocaleThatCantBeLoaded() {
        FakeValues fakeValues = new FakeValues(new Locale("nothing"));
        assertThat(fakeValues.get(PATH), is(nullValue()));
    }

}