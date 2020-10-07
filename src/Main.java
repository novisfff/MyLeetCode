import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution11 solution = new Solution11();
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            int area = solution.maxArea(ints);
            System.out.println(area);

        }).start(10).printMs();

    }
}
