import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution3 solution = new Solution3();
        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            int length = solution.lengthOfLongestSubstring("abcabcbb");
            System.out.println(length);

        }).start(10).printMs();

    }
}
