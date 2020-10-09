package solutions.s1to49;

import java.util.*;

public class Solution17 {

    /**
     * 17.电话号码的字母组合
     * <p>
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
     * <p>
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     *
     * @param digits
     * @return
     */
    //回溯算法
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        StringBuilder combination = new StringBuilder();
        backTrack(combinations, 0, combination, digits);
        return combinations;
    }

    private static final Map<Character, String> map = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    private void backTrack(List<String> combinations, int index, StringBuilder combiantion, String digits) {
        if (index == digits.length()) {
            combinations.add(combiantion.toString());
        } else {
            String s = map.get(digits.charAt(index));
            for (int i = 0; i < s.length(); i++) {
                combiantion.append(s.charAt(i));
                backTrack(combinations, index + 1, combiantion, digits);
                combiantion.deleteCharAt(index);
            }
        }
    }



    /*public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        List<StringBuilder> stringBuilderList = new LinkedList<>();
        List<String> list = new LinkedList<>();
        for (char c : chars) {
            stringBuilderList = disposeList(stringBuilderList, Integer.parseInt(String.valueOf(c)));
        }
        for (StringBuilder stringBuilder : stringBuilderList) {
            list.add(stringBuilder.toString());
        }
        return list;
    }

    private static List<StringBuilder> disposeList(List<StringBuilder> list, int i) {
        if (list.size() == 0) {
            for (char c : getLetter(i)) {
                list.add(new StringBuilder().append(c));
            }
        } else {
            List<StringBuilder> newList = new LinkedList<StringBuilder>();
            Iterator<StringBuilder> iterator = list.iterator();
            while (iterator.hasNext()) {
                StringBuilder stringBuilder = iterator.next();
                char[] letter = getLetter(i);
                for (int j = 0; j < letter.length; j++) {
                    if (j == letter.length - 1) {
                        stringBuilder.append(letter[j]);
                    } else {
                        newList.add(new StringBuilder(stringBuilder).append(letter[j]));
                    }
                }
            }
            list.addAll(newList);
        }
        return list;
    }

    private static char[] getLetter(int i) {
        if (i < 7) {
            return new char[]{(char) (91 + 3 * i), (char) (92 + 3 * i), (char) (93 + 3 * i)};
        } else if (i == 7) {
            return new char[]{'p', 'q', 'r', 's'};
        } else if (i == 8) {
            return new char[]{'t', 'u', 'v'};
        } else {
            return new char[]{'w', 'x', 'y', 'z'};
        }
    }*/

    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        List<String> strings = solution.letterCombinations("43432432");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
