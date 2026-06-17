package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        String result = HelloWorld.greet("World");
        assertEquals("Hello, World!", result);
    }
}
