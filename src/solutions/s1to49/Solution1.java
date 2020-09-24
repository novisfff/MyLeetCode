package solutions.s1to49;

import java.util.HashMap;

public class Solution1 {

    /**
     * 1. 两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums   整数数组
     * @param target 目标值
     * @return 和为目标值的那两个整数的数组下标
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int anotherNum;
        for (int i = 0; i < nums.length; i++) {
            anotherNum = target - nums[i];
            if (map.containsKey(anotherNum)) {
                return new int[]{map.get(anotherNum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }



}
