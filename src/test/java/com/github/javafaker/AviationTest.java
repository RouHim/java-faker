package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static com.github.javafaker.matchers.IsStringWithContents.isStringWithContents;
import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class AviationTest extends AbstractFakerTest {

    @Test
    public void airport() {
        assertThat(faker.aviation().airport(), matchesRegularExpression("\\w{4}"));
    }

    @Test
    public void aircraft() {
        assertThat(faker.aviation().aircraft(), isStringWithContents());
    }

    @Test
    public void metar() {
        assertThat(faker.aviation().METAR(), isStringWithContents());
    }
}