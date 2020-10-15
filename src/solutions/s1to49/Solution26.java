package solutions.s1to49;


public class Solution26 {

    /**
     * 26. 删除排序数组中的重复项
     * <p>
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int p1 = 0;
        int p2 = 0;
        int length = nums.length;
        while (p2 < nums.length - 1) {
            p2++;
            if (nums[p2] == nums[p1]) {
                length--;
            } else {
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return length;
    }

}
