package solutions.selse;

public class Solution884 {

    public boolean backspaceCompare(String S, String T) {
        int p1 = S.length();
        int p2 = T.length();
        if(p1 == 0 && p2 == 0) {
            return true;
        }
        if(p1 == 0 || p2 == 0) {
            return false;
        }
        while(p1 >= 0 || p2 >= 0) {
            p1 = getNextChar(S, p1, 0);
            p2 = getNextChar(T, p2, 0);
            if(p1 < 0 || p2 < 0) {
                return p1 == p2;
            }
            if(S.charAt(p1) != T.charAt(p2)) {
                return false;
            }
        }
        return true;
    }
    private int getNextChar(String s, int index, int sharp) {
        index--;
        if(index <= 0) {
            return sharp == 0 && s.charAt(0) != '#' ?  index : -1;
        }
        char c = s.charAt(index);
        if(c == '#') {
            return getNextChar(s, index, ++sharp);
        }
        if(sharp == 0) {
            return index;
        }
        return getNextChar(s, index, --sharp);
    }

    public static void main(String[] args) {
        Solution884 solution884 = new Solution884();
        boolean b = solution884.backspaceCompare("bxj##tw", "bxj###tw");
        System.out.println(b);
    }
}
