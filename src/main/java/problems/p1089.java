package problems;

import utils.Print;

public class p1089 {
    public static void main(String[] args) {
        // int[] nums = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        int[] nums = new int[] { 8, 4, 5, 0, 0, 0, 0, 7 };
        new p1089().duplicateZeros(nums);
        Print.Array(nums);
    }

    public void duplicateZeros(int[] nums) {

        int zero_count = 0;
        boolean overflow = false;
        for (int i = 0; i < nums.length - zero_count; i++) {
            if (nums[i] == 0) {
                if (i == nums.length - 1 - zero_count)
                    overflow = true;
                zero_count++;
            }
        }

        System.out.println(zero_count);
        int ptr = nums.length - 1;

        if (overflow) {
            nums[ptr--] = 0;
        }

        for (int i = nums.length - 1 - zero_count; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[ptr--] = 0;
            }
            nums[ptr--] = nums[i];
        }
    }
}
