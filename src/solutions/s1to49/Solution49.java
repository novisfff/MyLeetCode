package solutions.s1to49;

import java.nio.channels.NonWritableChannelException;
import java.util.*;

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            String orderString = getOrderString(s);
            if(map.containsKey(orderString)) {
                map.get(orderString).add(s);
            }
            else {
                LinkedList<String> newList = new LinkedList<>();
                newList.add(s);
                map.put(orderString, newList);
            }
        }
        return new LinkedList<>(map.values());
    }

    private String getOrderString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return String.copyValueOf(chars);
    }

}
