package solutions.s1to49;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution2 {

    /**
     * 2.两数相加
     * <p>
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
     * <p>
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     * <p>
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    /*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansList = null;
        ListNode currentList = null;
        int carry = 0;
        do {
            int i = getCurrentVal(l1) + getCurrentVal(l2) + carry;
            carry = i / 10;
            if (currentList != null) {
                currentList.next = new ListNode(i % 10);
                currentList = currentList.next;
            } else {
                currentList = new ListNode(i % 10);
                ansList = currentList;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        while (l1 != null || l2 != null || carry == 1);

        return ansList;
    }

    public int getCurrentVal(ListNode listNode) {
        if (listNode != null) {
            return listNode.val;
        } else {
            return 0;
        }
    }*/


}
