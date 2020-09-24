package solutions.s1to49;

public class Solution7 {

    /**
     * 7.整数反转
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     *
     * @param x
     * @return
     */

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }

    /*public int reverse(int x) {
        int abs = Math.abs(x);
        long out = 0;
        for (int i = 0; i < 32; i++) {
            out *= 10;
            out += abs % 10;
            if ((abs /= 10) == 0) {
                break;
            }
        }
        if (out > 2147483647 || out < -2147483648) {
            return 0;
        }
        if (x < 0) {
            return -(int) out;
        }
        return (int) out;
    }*/
}
