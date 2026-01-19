package problems;

public class p3668 {

    public static void main(String[] args) {
        int[] order = new int[] { 3, 1, 2, 5, 4 };
        int[] friends = new int[] { 1, 3, 4 };

        var solution = new p3668().recoverOrder(order, friends);
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    // @order: id according to finishing order
    // @friends: sorted id of the friends
    // @return: id of friends in finishing order
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] solution = new int[friends.length];
        int ptr = 0;

        for (int i : order) {
            int idx = binarySearch(friends, i);
            if (idx >= 0) {
                solution[ptr++] = i;
            }
        }

        return solution;
    }

    public int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return -1;
    }
}
