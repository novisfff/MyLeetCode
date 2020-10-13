package solutions.s1to49;

import org.w3c.dom.Node;

import java.lang.invoke.VarHandle;
import java.util.PriorityQueue;

public class Solution23 {

    //TODO 先合并2个

    /**
     * 23. 合并K个升序链表
     * <p>
     * 给你一个链表数组，每个链表都已经按升序排列。
     * <p>
     * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
     *
     * @param lists
     * @return
     */
    //优先队列法
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<NodeStatus> queue = new PriorityQueue<>();
        for (ListNode list : lists) {
            if(list != null) {
                queue.offer(new NodeStatus(list));
            }
        }
        ListNode start = new ListNode(0);
        ListNode currentNode = start;
        while (!queue.isEmpty()) {
            currentNode.next = queue.poll().listNode;
            currentNode = currentNode.next;
            if(currentNode.next != null) {
                queue.offer(new NodeStatus(currentNode.next));
            }
        }
        return start.next;
    }

    class NodeStatus implements Comparable<NodeStatus> {
        ListNode listNode;

        public NodeStatus(ListNode listNode) {
            this.listNode = listNode;
        }

        @Override
        public int compareTo(NodeStatus o) {
            return listNode.val - o.listNode.val;
        }
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode[] nodes = {l1, l2};
        Solution23 solution23 = new Solution23();
        solution23.mergeKLists(nodes);
    }

    //每次找最小，太慢了
    /*
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        ListNode start = new ListNode(0);
        ListNode currentNode = start;
        while (true) {
            int smallestIndex = getSmallestIndex(lists);
            if(smallestIndex == -1) {
                break;
            }
            currentNode.next = lists[smallestIndex];
            currentNode = currentNode.next;
            lists[smallestIndex] = lists[smallestIndex].next;
        }
        return start.next;
    }

    public int getSmallestIndex (ListNode[] lists) {
        int index = -1;
        int smallerVal = 0;
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                index = i;
                smallerVal = lists[i].val;
                break;
            }
        }
        if(index == -1) {
            return index;
        }
        for (int i = index; i < lists.length; i++) {
            if(lists[i] == null) {
                continue;
            }
            if(lists[i].val < smallerVal) {
                smallerVal = lists[i].val;
                index = i;
            }
        }
        return index;
    }
     */

}
