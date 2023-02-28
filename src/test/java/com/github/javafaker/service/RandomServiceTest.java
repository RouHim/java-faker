package com.github.javafaker.service;

import com.github.javafaker.AbstractFakerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.CombinableMatcher.both;

public class RandomServiceTest extends AbstractFakerTest {

    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"RandomService(Random)", new RandomService(new Random())},
                {"RandomService()", new RandomService()}
        };
        return Arrays.asList(data);
    }

    @DisplayName("Created via {0}")
    @ParameterizedTest(name = "Created via {0}")
    @MethodSource("data")
    public void testRandomService(String title, RandomService randomService) {
        assertThat(randomService.nextLong(1), is(0L));

        for (int i = 1; i < 10; i++) {
            assertThat(randomService.nextLong(2), lessThan(2L));
        }

        assertThat(randomService.nextLong(Long.MAX_VALUE), greaterThan(0L));
        assertThat(randomService.nextLong(Long.MAX_VALUE), lessThan(Long.MAX_VALUE));

        for (int i = 1; i < 100; i++) {
            assertThat(randomService.nextInt(-5, 5), both(lessThanOrEqualTo(5)).and(greaterThanOrEqualTo(-5)));
        }

        assertThat(randomService.hex(8), matchesRegularExpression("^[0-9A-F]{8}$"));
        assertThat(randomService.hex(), matchesRegularExpression("^[0-9A-F]{8}$"));
    }
}