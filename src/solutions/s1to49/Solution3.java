package solutions.s1to49;

import java.util.*;

public class Solution3 {

    /**
     * 3.无重复字符的最长子串
     * <p>
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * @param s
     * @return
     */

    /**
     * 滑动解法
     */
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }


    /**
     * List实时记录解法
     */
    /*public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> list = new LinkedList<>();
        char[] charArray = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (list.contains(c)) {
                list = clean(list, c);
            }
            list.add(c);
            maxLength = list.size() > maxLength ? list.size() : maxLength;

        }
        return maxLength;
    }

    public static LinkedList<Character> clean(LinkedList<Character> list, char c) {
        return list.removeFirst() == c ? list : clean(list, c);
    }*/

}
