package problems;

import utils.Print;

public class p80 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int size = new p80().removeDuplicates(nums);
        System.err.println(size);
        Print.Array(nums);
    }

    public int removeDuplicates(int[] nums) {
        int ptr = 0;

        int current_element = nums[0];
        int current_hits = 0;
        for (int i = 0; i < nums.length; i++) {
            if (current_element == nums[i]) {
                if (current_hits < 2) {
                    nums[ptr++] = nums[i];
                }
                current_hits++;
            } else {
                current_element = nums[i];
                current_hits = 1;
                nums[ptr++] = nums[i];
            }
        }

        return ptr;
    }
}
