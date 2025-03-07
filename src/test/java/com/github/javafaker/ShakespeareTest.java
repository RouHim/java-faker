package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;

public class ShakespeareTest extends AbstractFakerTest {

    @Test
    public void testHamletQuote() {
        assertThat(faker.shakespeare().hamletQuote(), not(isEmptyOrNullString()));
    }

    @Test
    public void testAsYouLikeItQuote() {
        assertThat(faker.shakespeare().asYouLikeItQuote(), not(isEmptyOrNullString()));
    }

    @Test
    public void testKingRichardIIIQuote() {
        assertThat(faker.shakespeare().kingRichardIIIQuote(), not(isEmptyOrNullString()));
    }

    @Test
    public void testRomeoAndJulietQuote() {
        assertThat(faker.shakespeare().romeoAndJulietQuote(), not(isEmptyOrNullString()));
    }

}