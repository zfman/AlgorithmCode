package offer;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 链表中倒数第k个结点
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class FindKthToTailSolution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode fast = head;
        ListNode low = head;
        for (int i = 1; i < k; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else return null;
        }

        while (fast.next != null) {
            fast = fast.next;
            low = low.next;
        }

        return low;
    }

    public static void main(String[] args) {
        int[] array = {
                1
        };
        ListNode node = LinkedUtils.arrayToLinkedList(array);
        ListNode r = new FindKthToTailSolution().FindKthToTail(node, 1);
        System.out.println(r == null ? "root is null" : r.val);
    }
}
