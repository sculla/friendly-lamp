package dev.sculla.main;

import dev.sculla.helloworld.HelloWorld;

public class Main {
    /**
     * @param args need to understand a bit better
     */
    public static void main(String... args) {
        int result = 42;
        System.out.println(result + "=" + "this val");

        final String sayWhat = HelloWorld.sayWhat();
        System.out.println(sayWhat);
    }
}
