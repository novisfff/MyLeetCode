package solutions.s1to49;

public class Solution19 {

    /**
     * 19.删除链表的倒数第N个字节
     * <p>
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode targetListNode = null;
        ListNode currentListNode = head;
        int index = 0;
        while (currentListNode != null) {
            index++;
            if (index - n > 1) {
                targetListNode = targetListNode.next;
            } else if (index - n == 1) {
                targetListNode = head;
            }
            currentListNode = currentListNode.next;
        }
        if (targetListNode != null) {
            targetListNode.next = targetListNode.next.next;
            return head;
        } else {
            return head.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Solution19 solution19 = new Solution19();
        solution19.removeNthFromEnd(listNode, 2);
    }


}
