package solutions.s1to49;

public class Solution6 {

    /**
     * 6.Z字型变换
     * <p>
     * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     * <p>
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     * <p>
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     * <p>
     * 请你实现这个将字符串进行指定行数变换的函数：
     * <p>
     * string convert(string s, int numRows);
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        int length = s.length();
        int step1 = numRows > 2 ? numRows * 2 - 2 : numRows;
        int group = length % step1 == 0 ? length / step1 : length / step1 + 1;
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < group; i++) {
                if (j + step1 * i < length) {
                    stringBuilder.append(chars[j + step1 * i]);
                }
                if (j != 0 && j != numRows - 1) {
                    int step2 = numRows - j - 1;
                    if (j + step1 * i + 2 * step2 < length) {
                        stringBuilder.append(chars[j + step1 * i + 2 * step2]);
                    }
                }

            }
        }
        return stringBuilder.toString();
    }

}
