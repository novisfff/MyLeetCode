import utils.*;
import solutions.s1to49.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //此处输入不计算时间的初始化代码

        Solution2 solution = new Solution2();
        ListNode l1 = new ListNode(5);
        //l1.next = new ListNode(4);
        //l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        //l2.next = new ListNode(6);
        //l2.next.next = new ListNode(4);

        new RunTime(() -> {
            //此处输入需要计算运行时间的代码

            ListNode listNode = solution.addTwoNumbers(l1, l2);
            System.out.println(listNode.next.val + "" + listNode.val);

        }).start(10).printMs();

    }
}
