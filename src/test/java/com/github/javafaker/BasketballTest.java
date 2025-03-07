package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasketballTest extends AbstractFakerTest {

    @Test
    public void testPositions() {
        Faker faker = new Faker();
        assertThat(faker.basketball().positions(), matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testTeams() {
        Faker faker = new Faker();
        assertThat(faker.basketball().teams(), matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testCoaches() {
        Faker faker = new Faker();
        assertThat(faker.basketball().coaches(), matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testPlayers() {
        Faker faker = new Faker();
        assertThat(faker.basketball().players(), matchesRegularExpression("[\\p{L}'()\\., 0-9-’’]+"));
    }

    @Test
    public void testPositionsWith10000Times() {
        Faker faker = new Faker();
        boolean isExist = false;
        for (int i = 0; i < 10000; i++) {
            String generateString = faker.basketball().positions();
            if (generateString.equals("Point Guard")) {
                isExist = true;
            }
        }
        assertTrue(isExist);
    }

    @Test
    public void testTeamsWith10000Times() {
        Faker faker = new Faker();
        boolean isExist = false;
        for (int i = 0; i < 10000; i++) {
            String generateString = faker.basketball().teams();
            if (generateString.equals("Atlanta Hawks")) {
                isExist = true;
            }
        }
        assertTrue(isExist);
    }

    @Test
    public void testCoachesWith10000Times() {
        Faker faker = new Faker();
        boolean isExist = false;
        for (int i = 0; i < 10000; i++) {
            String generateString = faker.basketball().coaches();
            if (generateString.equals("Kenny Atkinson")) {
                isExist = true;
            }
        }
        assertTrue(isExist);
    }

    @Test
    public void testPlayersWith10000Times() {
        Faker faker = new Faker();
        boolean isExist = false;
        for (int i = 0; i < 10000; i++) {
            String generateString = faker.basketball().players();
            if (generateString.equals("Joel Embiid")) {
                isExist = true;
            }
        }
        assertTrue(isExist);
    }
}