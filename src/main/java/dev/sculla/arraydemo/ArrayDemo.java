package dev.sculla.arraydemo;

public class ArrayDemo {
    public static void main(String... args) {
        int[] sample = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            sample[i] = i+10;
        }
        for (i = 0; i < 10; i++) {
            System.out.printf("This is Sample[%d]: %d\n", sample[i], i);
        }
    }
}
