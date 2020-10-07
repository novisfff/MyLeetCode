package solutions.s1to49;

import java.util.HashMap;
import java.util.Map;

public class Solution12 {
    /**
     * 12.整数转罗马数字
     * <p>
     * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
     * <p>
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * <p>
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     * <p>
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int div = 1000;
        int bit = 0;
        for (int i = 0; i < 4; i++) {
            if ((bit = num / div) != 0) {
                if (bit == 9) {
                    stringBuilder.append(map.get(9 * div));
                } else if (bit > 5) {
                    stringBuilder.append(map.get(5 * div));
                    String s = map.get(div);
                    for (int j = 0; j < bit - 5; j++) {
                        stringBuilder.append(s);
                    }
                } else if (bit == 5) {
                    stringBuilder.append(map.get(5 * div));
                } else if (bit == 4) {
                    stringBuilder.append(map.get(4 * div));
                } else {
                    String s = map.get(div);
                    for (int j = 0; j < bit; j++) {
                        stringBuilder.append(s);
                    }
                }
                num %= div;
            }
            div /= 10;
        }
        return stringBuilder.toString();
    }

    private static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }


}
