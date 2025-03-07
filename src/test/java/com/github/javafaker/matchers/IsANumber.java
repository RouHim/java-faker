package com.github.javafaker.matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsANumber extends TypeSafeMatcher<String> {


    public static <T> Matcher<String> isANumber() {
        return new IsANumber();
    }

    @Override
    protected boolean matchesSafely(String item) {
        try {
            new Double(item);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("is a number");
    }
}