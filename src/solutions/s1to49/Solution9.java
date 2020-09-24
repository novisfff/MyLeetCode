package solutions.s1to49;

public class Solution9 {

    /**
     * 9.回文数
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * @param x
     * @return
     */

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int ans = 0;
        while (x > ans) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return x == ans || x == ans / 10;
    }

    /*public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || (x % 10 == 0)) {
            return false;
        }
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            ans = ans * 10 + pop;
            if (ans > x) {
                return false;
            } else if (ans == x || ans == (x /= 10)) {
                return true;
            }
        }
        return false;
    }
*/
    /*public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int ans = 0;
        int y = x;
        while (y != 0) {
            int pop = y % 10;
            ans = ans * 10 + pop;
            y /= 10;
        }
        if (ans == x) {
            return true;
        }
        return false;
    }
*/
}
