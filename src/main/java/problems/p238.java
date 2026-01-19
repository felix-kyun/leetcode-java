package problems;

import java.util.*;

public class p238 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        var sol = new p238().productExceptSelf(arr);
        for (int i : sol) {
            System.out.printf("%d ", i);
        }
    }

    int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);

        // prefix
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= prefix;
            prefix *= nums[i];
        }

        // suffix
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}
