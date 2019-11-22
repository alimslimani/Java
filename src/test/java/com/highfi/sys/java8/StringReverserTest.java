package com.highfi.sys.java8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    @Test
    public void shouldTextReverse() {
        StringReverser sr = new StringReverser();
        assertEquals("alim", sr.reverser("mila"));
    }

}
