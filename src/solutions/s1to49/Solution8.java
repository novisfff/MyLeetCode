package solutions.s1to49;

public class Solution8 {

    /**
     * 8. 字符串转换整数 (atoi)
     * <p>
     * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
     * <p>
     * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
     * <p>
     * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
     * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
     * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
     * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
     * <p>
     * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
     * <p>
     * 提示：
     * <p>
     * 本题中的空白字符只包括空格字符 ' ' 。
     * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/string-to-integer-atoi
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int ans = 0;
        int noZeroIndex = getNoZeroIndex(chars);
        boolean plusSign = true;
        if (chars[noZeroIndex] == '+' && noZeroIndex < chars.length - 1) {
            noZeroIndex++;
        } else if (chars[noZeroIndex] == '-' && noZeroIndex < chars.length - 1) {
            noZeroIndex++;
            plusSign = false;
        }
        for (int i = noZeroIndex; i < chars.length; i++) {
            int num = 0;
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = chars[i] - 48;
            } else {
                return plusSign ? ans : -ans;
            }
            if (plusSign) {
                if (ans < 214748364 || (ans == 214748364 && num < 7)) {
                    ans = ans * 10 + num;
                } else {
                    return Integer.MAX_VALUE;
                }
            } else {
                if (ans < 214748364 || (ans == 214748364 && num < 8)) {
                    ans = ans * 10 + num;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return plusSign ? ans : -ans;
    }

    public static int getNoZeroIndex(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                return i;
            }
        }
        return chars.length - 1;
    }

}
