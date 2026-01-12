package problems;

public class p167 {

    public static void main(String[] args) {
        int[] numbers = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] solution = new p167().twoSum(numbers, target);
        System.out.printf(
            "target: %d, solution: [%d, %d]",
            target,
            solution[0],
            solution[1]
        );
    }

    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;

        int sum = numbers[first] + numbers[last];
        while (sum != target) {
            if (sum < target) first++;
            else last--;
            sum = numbers[first] + numbers[last];
            System.out.println(sum);
        }

        return new int[] { first + 1, last + 1 };
    }
}
