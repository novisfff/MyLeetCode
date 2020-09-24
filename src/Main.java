import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution9 solution = new Solution9();

        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            boolean palindrome = solution.isPalindrome(1001);
            System.out.println(palindrome);

        }).start(10).printMs();

    }
}
