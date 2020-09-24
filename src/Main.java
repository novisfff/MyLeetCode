import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution13 solution = new Solution13();

        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            int toInt = solution.romanToInt("MCMXCIV");
            System.out.println(toInt);

        }).start(10).printMs();

    }
}
