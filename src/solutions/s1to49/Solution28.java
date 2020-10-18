package solutions.s1to49;

public class Solution28 {

    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if(l2 == 0) {
            return 0;
        }
        for(int i = 0; i <= l1 - l2; i++) {
            for(int j = 0; j < l2; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                } else if (j == l2 -1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int i = solution28.strStr("", "");
        System.out.println(i);
    }
}
