package com.pinnegar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegexTest {
    @Test
    public void space_splitter() {
        assertThat("1 2 3".split(" ")).containsExactly("1", "2", "3");
    }
}
