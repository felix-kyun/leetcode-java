package problems;

public class p557 {
    public static void main(String[] args) {
        System.out.println(new p557().reverseWords("Let's take LeetCode contest"));
    }

    // both inclusive
    public static void reverseWithin(StringBuilder sb, int start, int end) {
        while (start <= end) {
            char c = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, c);
        }
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);

        int len = s.length();
        int save = 0;
        int ptr = 0;

        while (ptr <= len) {
            if (ptr < len && sb.charAt(ptr) == ' ') {
                reverseWithin(sb, save, ptr - 1);
                save = ++ptr;
            } else if (ptr == len - 1) {
                reverseWithin(sb, save, ptr);
                ptr++;
            } else ptr++;
        }

        return sb.toString();
    }
}
