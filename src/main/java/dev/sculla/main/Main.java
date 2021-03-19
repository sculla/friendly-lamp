package dev.sculla.main;

import dev.sculla.helloworld.HelloWorld;

public class Main {
    /**
     * @param args need to understand a bit better
     */
    public static void main(String... args) {
        final String sayWhat = HelloWorld.sayWhat();
        System.out.println(sayWhat);
    }
}
