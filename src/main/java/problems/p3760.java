package problems;

public class p3760 {

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(new p3760().maxDistinct(s));
    }

    public int maxDistinct(String s) {
        int[] map = new int[26];
        int distinct = 0;

        for (char c : s.toCharArray()) {
            if (map[c - 'a'] == 0) {
                map[c - 'a'] = 1;
                distinct++;
            }
        }

        return distinct;
        // return (int) Arrays.stream(map)
        //     .filter(i -> i > 0)
        //     .count();
    }
}
