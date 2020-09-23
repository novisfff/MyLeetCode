import utils.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution solution = new Solution();
        int[] nums = {5, 7, 8, 3, 9, 10, 11, 12, 13, 14, 15, 2};
        int target = 9;

        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            solution.twoSum(nums, target);

        }).start(100).printMs();

    }
}
