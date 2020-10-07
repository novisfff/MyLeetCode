package solutions.s1to49;

import java.util.ArrayList;

public class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int s = (j - i) * Math.min(height[i], height[j]);
                if (s > max) {
                    max = s;
                }
            }
        }
        return max;
    }
}
