package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemographicTest extends AbstractFakerTest {

    @Test
    public void race() {
        assertThat(faker.demographic().race(), matchesRegularExpression("(\\w+ ?)+"));
    }

    @Test
    public void educationalAttainment() {
        assertThat(faker.demographic().educationalAttainment(), matchesRegularExpression("(?U)([\\w'-]+ ?)+"));
    }

    @Test
    public void demonym() {
        assertThat(faker.demographic().demonym(), matchesRegularExpression("(?U)([\\w'-]+ ?)+"));
    }

    @Test
    public void maritalStatus() {
        assertThat(faker.demographic().maritalStatus(), matchesRegularExpression("(\\w+ ?)+"));
    }

    @Test
    public void sex() {
        assertThat(faker.demographic().sex(), matchesRegularExpression("\\w+"));
    }
}