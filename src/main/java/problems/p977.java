package problems;

public class p977 {

    public static void main(String[] args) {
        int[] arr = new int[] { -4, -1, 0, 3, 10 };
        var sol = new p977().sortedSquares(arr);
        for (int i : sol) {
            System.out.printf("%d ", i);
        }
    }

    public int[] sortedSquares(int[] nums) {
        int[] solved = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int ptr = nums.length - 1;

        while (left <= right) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];
            if (a > b) {
                solved[ptr] = a;
                left++;
            } else {
                solved[ptr] = b;
                right--;
            }

            ptr--;
        }

        return solved;
    }
}
