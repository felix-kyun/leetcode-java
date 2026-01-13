package problems;

import java.util.HashSet;
import java.util.Arrays;
import utils.Swap;

public class p345 {
    public static void main(String[] args) {
        System.out.println(new p345().reverseVowels("IceCreAm"));
    }

    private static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static boolean isVowel(char c) {
        return vowels.contains(Character.toLowerCase(c));
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int a = 0;
        int b = arr.length - 1;

        while (a <= b) {
            if (!isVowel(arr[a])) {
                a++;
            } else if (!isVowel(arr[b])) {
                b--;
            } else {
                Swap.Swap(arr, a++, b--);
            }
        }

        return new String(arr);
    }
}
