package dev.sculla.main;

import dev.sculla.helloworld.HelloWorld;

public class Main {
    public static void main(String... args) {
        int result = 42;
        System.out.println(result + "=" + "this val");

        final String sayWhat = HelloWorld.sayHello();
        System.out.println(sayWhat);
    }
}
