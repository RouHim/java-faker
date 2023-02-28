package com.github.javafaker;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;

public class MatzTest extends AbstractFakerTest {

    @Test
    public void quote() {
        assertThat(faker.matz().quote(), not(isEmptyOrNullString()));
    }
}