package com.mpinnegar;

import org.junit.Test;

public class OuterTest {
    @Test
    public void first_test() throws Exception {
        String var2 = "var2";
        Outer.main(new String[]{"variable1", var2});
    }
}
