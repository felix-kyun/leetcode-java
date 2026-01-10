package problems;

import java.util.HashMap;
import utils.Print;
import utils.Mock;

public class p1 {

    public static void main(String[] args) {
        int[] arr = Mock.UnsortedArray(10, 100);
        int target = Mock.FromArray(arr) + Mock.FromArray(arr);
        System.out.printf("target: %d\n", target);
        Print.Array(arr);
        Print.Array(new p1().twoSum(arr, target));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {-1, -1};
    }
}
