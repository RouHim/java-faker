package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

public class ChuckNorrisTest extends AbstractFakerTest {

    @Test
    public void testFact() {
        assertThat(faker.chuckNorris().fact(), not(isEmptyOrNullString()));
    }
}