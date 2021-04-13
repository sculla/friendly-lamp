package dev.sculla.breaktest;

public class BreakTest {
    public static void main(String... args) {
        for (long i = 1000000000000L; i < Long.MAX_VALUE; i++) {
            boolean count = true;
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = false;
//                    System.out.println(i + " lowest common denominator is " + j);
                    break;
                }
            }
            if (count) System.out.println(i + " is PRIME");
        }
    }
}
