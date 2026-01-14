package problems;

import java.util.HashSet;
import utils.Print;
import utils.Mock;

public class p349 {
    public static void main(String[] args) {
        int[] a = Mock.UnsortedArray(10, 50);
        int[] b = Mock.UnsortedArray(15, 50);
        Print.Array(a);
        Print.Array(b);
        Print.Array(new p349().intersection(a, b));
    }

    public int[] intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        int[] first = (a.length < b.length) ? a : b; 
        int[] second = (a.length < b.length) ? b : a; 

        for (int i : first) {
            set.add(i);
        }

        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int i: second) {
            if (set.contains(i)) {
                intersectionSet.add(i);
            }
        }

        int[] solution = new int[intersectionSet.size()];
        int ptr = 0;
        for (int i: intersectionSet) {
            solution[ptr++] = i;
        }

        return solution;
    }
}

