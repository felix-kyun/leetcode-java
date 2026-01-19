package problems;

import java.util.Arrays;
import java.util.LinkedList;

import utils.Print;

public class p2975 {
    public static void main(String[] args) {
        System.err.println(new p2975().maximizeSquareArea(4, 3, new int[] {2, 3}, new int[] {2}));
    }

    public static int findArea(int hStart, int hEnd, int vStart, int vEnd) {

        if (hEnd - hStart == vEnd - vStart) {
            return (hEnd - hStart) * (vEnd - vStart);
        }

        return -1;
    }

    public static int findAreaOfAllSquares(LinkedList<Integer> hFences, LinkedList<Integer> vFences) {
        int maxArea = -1;

        int hStart = 1;
        int vStart = 1;

        for (int h: hFences) {
            for (int v: vFences) {
                int area = findArea(hStart, h, vStart, v);

                if (area > maxArea) area = maxArea;

                vStart = v;
            }
            hStart = h;
        }

        return maxArea;
    }

    public static int permute(
        int hStart, int vStart,
        int[] hFences, int[] vFences,
        LinkedList<Integer> hList, LinkedList<Integer> vList
    ) {
        int maxArea = -1;


        return maxArea;
    }

    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int maxArea = -1;

        // permute the fences
        // maxArea = findAreaOfAllSquares(new LinkedList<Integer>(Arrays.asList(hFences)), null)

        return maxArea;
    }
}