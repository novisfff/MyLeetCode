import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution5 solution = new Solution5();
        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            String s = solution.longestPalindrome("ccc");
            System.out.println(s);

        }).start(10).printMs();

    }
}
