import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution7 solution = new Solution7();

        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            int reverse = solution.reverse(1534236469);
            //System.out.println(reverse);

        }).start(10).printMs();

    }
}
