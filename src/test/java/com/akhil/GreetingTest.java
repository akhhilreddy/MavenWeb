package com.akhil;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {
    @Test
    public void messageIncludesName() {
        Greeting greeting = new Greeting();
        assertEquals("Hello, Akhil!", greeting.message("Akhil"));
    }
}
