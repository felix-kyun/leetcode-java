package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class p179 {
    public static void main(String[] args) {
        System.out.println(new p179().largestNumber(new int[] {10}));
    }

    public String largestNumber(int[] nums) {
        LinkedList<Integer> out = Arrays.stream(nums)
                                        .filter(n -> n < 10)
                                        .boxed()
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toCollection(LinkedList::new));

        Arrays.stream(nums)
                .filter(n -> n > 9 && n < 100)
                .forEach(n -> {
                    int ones = n % 10;
                    int tens = n / 10;

                    boolean inserted = false;
                    for (int i = 0; i < out.size() - 1; i++) {
                        if (tens >= out.get(i) && ones > out.get(i + 1)) {
                            out.add(i, ones);
                            out.add(i, tens);
                            inserted = true;
                            break;
                        }
                    }

                    if (!inserted) {
                        out.add(tens);
                        out.add(ones);
                    }
            });

        Arrays.stream(nums)
            .filter(n -> n == 100)
            .forEach(i -> {
                out.add(i);
            });

        return out.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(""));
    }
}
