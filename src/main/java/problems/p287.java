package problems;

public class p287 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 4, 2, 2 };
        System.out.println(new p287().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        long sn = (nums.length - 1) * (2 + (nums.length - 1 - 1)) / 2;

        long sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return (int) (sum - sn);
    }
}
