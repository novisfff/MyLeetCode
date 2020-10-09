package solutions.s1to49;

public class Solution21 {

    /**
     * 21. 合并两个有序链表
     * <p>
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
     * <p>
     * 示例：
     * <p>
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param l1
     * @param l2
     * @return
     */
    //递归方法，真正的将两个链表拼接到了一起
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = null;
        ListNode currentNode = null;
        while (l1 != null || l2 != null) {
            ListNode smallerOne = null;
            if (l1 == null) {
                smallerOne = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                smallerOne = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    smallerOne = l1;
                    l1 = l1.next;
                } else {
                    smallerOne = l2;
                    l2 = l2.next;
                }
            }
            if (ans == null) {
                ans = smallerOne;
                currentNode = ans;
            } else {
                currentNode.next = smallerOne;
                currentNode = currentNode.next;
            }
        }
        if (currentNode != null) {
            currentNode.next = null;
        }
        return ans;
    }*/

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        Solution21 solution21 = new Solution21();
        ListNode listNode = solution21.mergeTwoLists(l1, l2);
    }


}
