package problems;

public class p1351 {

    public static void main(String[] args) {
        int[][] arr = new int[][] {
            { 4, 3, 2, -1 },
            { 3, 2, 1, -1 },
            { 1, 1, -1, -2 },
            { -1, -1, -2, -3 },
        };
        System.out.println(new p1351().countNegatives(arr));
    }

    public int countNegatives(int[][] grid) {
        int neg = 0;
        int save_ptr = grid[0].length - 1;
        for (int i = 0; i < grid.length; i++) {
            inner: for (int j = save_ptr; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    neg += grid.length - i;
                    save_ptr--;
                } else break inner;
            }
        }

        return neg;
    }
}
