package solutions.s1to49;

public class Solution5 {

    /**
     * 5. 最长回文子串
     * <p>
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int[] maxInts = new int[]{0, 0};
        int[] ints;
        int left;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                ints = getPalindromic(chars, i - 1, i);
                if (ints[1] - ints[0] + 1 > maxLength) {
                    maxLength = ints[1] - ints[0] + 1;
                    maxInts = ints.clone();
                }
            }
            if (i >= 2 && chars[i] == chars[i - 2]) {
                ints = getPalindromic(chars, i - 2, i);
                if (ints[1] - ints[0] + 1 > maxLength) {
                    maxLength = ints[1] - ints[0] + 1;
                    maxInts = ints.clone();
                }
            }
        }
        return s.substring(maxInts[0], maxInts[1] + 1);
    }

    public static int[] getPalindromic(char[] chars, int left, int right) {
        while (left > 0 && right < chars.length - 1) {
            if (chars[left-1] != chars[right+1]) {
                break;
            }
            left--;
            right++;
        }
        return new int[]{left, right};
    }


    /*public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int[] maxInts = new int[]{0, 0};
        int[] ints;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                ints = getPalindromic(chars, i - 1, i);
                if (ints[1] - ints[0] + 1 > maxLength) {
                    maxLength = ints[1] - ints[0] + 1;
                    maxInts = ints.clone();
                }
            }
            if (i >= 2 && chars[i] == chars[i - 2]) {
                ints = getPalindromic(chars, i - 2, i);
                if (ints[1] - ints[0] + 1 > maxLength) {
                    maxLength = ints[1] - ints[0] + 1;
                    maxInts = ints.clone();
                }
            }
        }
        return s.substring(maxInts[0], maxInts[1] + 1);
    }

    public static int[] getPalindromic(char[] chars, int left, int right) {
        while (left > 0 && right < chars.length - 1) {
            left--;
            right++;
            if (chars[left] != chars[right]) {
                left++;
                right--;
                break;
            }
        }
        return new int[]{left, right};
    }*/

}
