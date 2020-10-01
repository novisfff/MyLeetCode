import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution6 solution = new Solution6();
        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            String s = solution.convert("ABCD", 2);
            System.out.println(s);

        }).start(10).printMs();

    }
}
