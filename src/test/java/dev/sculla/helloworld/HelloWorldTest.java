package dev.sculla.helloworld;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sayHello() {
        assertEquals("Hello World", HelloWorld.sayHello());
    }

    @Test
    void sayWhat() {
        assertEquals("EHHHHHH?", HelloWorld.sayWhat());
    }
}