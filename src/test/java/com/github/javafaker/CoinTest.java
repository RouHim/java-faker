package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoinTest extends AbstractFakerTest {

    @Test
    public void coinFlip() {
        assertThat(faker.coin().flip(), matchesRegularExpression("\\w+"));
    }
}