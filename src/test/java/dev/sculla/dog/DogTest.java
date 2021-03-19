package dev.sculla.dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest extends Dog {


    @Test
    void testBark() {
        Dog d = new Dog();
        d.size = 40;
        assertEquals("Ruff! Ruff!", d.bark());
    }
}