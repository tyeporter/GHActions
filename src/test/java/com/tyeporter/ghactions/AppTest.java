package com.tyeporter.ghactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
  
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldAnswerWithFalse() {
    	assertFalse(false);
    }

    @Test
    public void shouldBeEqual() {
    	assertEquals("Java", "Java");
    }

    @Test 
    public void shouldBeGreaterThan() {
    	assertTrue(25 > 10);
    }

    @Test
    public void shouldBeLessThan() {
    	assertTrue(150 < 200);
    }

}
