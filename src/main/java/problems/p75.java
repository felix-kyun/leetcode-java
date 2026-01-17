package problems;

import utils.Print;

public class p75 {

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.printf(" %d", i);
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 0 };
        Print.Array(arr);
        new p75().sortColors(arr);
        Print.Array(arr);
    }

    public static void swap(int[] arr, int idx_a, int idx_b) {
        int tmp = arr[idx_a];
        arr[idx_a] = arr[idx_b];
        arr[idx_b] = tmp;
    }

    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i <= end; ) {
            int current = nums[i];
            if (current == 0) {
                swap(nums, i, start++);
                i++;
            } else if (current == 2) {
                swap(nums, i, end--);
            } else {
                i++;
            }
        }
    }
}
