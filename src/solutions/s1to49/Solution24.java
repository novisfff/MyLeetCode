package solutions.s1to49;

public class Solution24 {
    /**
     * 24. 两两交换链表中的节点
     * <p>
     * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
     * <p>
     * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode firstNode = new ListNode(0, head);
        swapTwo(head, head.next, firstNode);
        return firstNode.next;
    }

    private boolean swapTwo(ListNode l1, ListNode l2, ListNode preNode) {
        ListNode nextNode = l2.next;
        l2.next = l1;
        preNode.next = l2;
        if (nextNode != null && nextNode.next != null) {
            return swapTwo(nextNode, nextNode.next, l1);
        } else {
            l1.next = nextNode;
            return true;
        }
    }

}
