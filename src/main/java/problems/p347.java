package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.IntStream;
import utils.Pair;

public class p347 {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k = 2;
        var sol = new p347().topKFrequent(arr, k);
        for (int i : sol) {
            System.out.printf("%d ", i);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.second - a.second
        );
        for (var e : map.entrySet()) {
            pq.add(new Pair<Integer, Integer>(e.getKey(), e.getValue()));
        }

        // get to K elements
        int[] list = new int[k];

        IntStream.range(0, k).forEach(i -> {
            var p = pq.poll();
            list[i] = p.first;
        });

        return list;
    }
}
