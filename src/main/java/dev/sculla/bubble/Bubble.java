package dev.sculla.bubble;

public class Bubble {
    public static void main(String[] args) {
        int size;
        size = 10;

        System.out.print("The original array is");
        int[] nums = {99, -10, 10093, 18, -972, 5467, 465, -9, 287, 49};
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d", nums[i]);
        }
        System.out.println();

        for (int a = 1; a < size; a++) {
            for (int b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    int t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }

            }

        }

        System.out.print("The Sorted array is");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d", nums[i]);
        }
    }
}
