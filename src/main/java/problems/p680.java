package problems;

public class p680 {
    public static void main(String[] args) {
        System.out.println(new p680().validPalindrome("aba"));
        System.out.println(new p680().validPalindrome("abca"));
        System.out.println(new p680().validPalindrome("abc"));
    }

    public boolean validPalindrome(String s) {
        return checkString(s, 0, s.length() - 1, true);
    }
    
    public boolean checkString(String s, int start, int end, boolean save) {
        while (start <= end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
                if (a != b) {
                    if (save) {
                        return checkString(s, start+1, end, false) || checkString(s, start, end - 1, false);
                    } else return false;
                } else {
                    start++;
                    end--;
                }
        }

        return true;
    }
}
