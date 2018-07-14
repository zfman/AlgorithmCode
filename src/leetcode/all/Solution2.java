package leetcode.all;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 两数相加.
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node = new ListNode(-1);//头节点
		ListNode p = node;//指示执行到的位置
		int plusOne = 0;//是否进位

		while (l1 != null || l2 != null) {
			//计算对应位和
			int v1 = (l1 != null) ? l1.val : 0;
			int v2 = (l2 != null) ? l2.val : 0;
			int r = v1 + v2 + plusOne;

			//之和大于9，减去十即为该值，并进位
			if (r > 9) {
				plusOne = 1;
				ListNode tmp = new ListNode(r - 10);
				p.next = tmp;
				p = tmp;
			} else {
				plusOne = 0;
				ListNode tmp = new ListNode(r);
				p.next = tmp;
				p = tmp;
			}
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}

		//如果最后一位仍然需要进位，创建节点
		if (plusOne == 1) {
			p.next = new ListNode(1);
		}
		return node.next;
	}

	public static void main(String[] args) {
		//你的算法必须是高效的，否则下面这个测试集是过不去的
		int[] list1 = {
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,9 };
		int[] list2 = {
				5,6,4,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,2,4,3,
				2,4,3,2,4,3,2,4,3,2,
				4,3,2,4,3,2,4,3,2,4,
				3,2,4,3,2,4,3,9,9,9,9 };

		ListNode l1 = LinkedUtils.arrayToLinkedList(list1);
		ListNode l2 = LinkedUtils.arrayToLinkedList(list2);

		ListNode root = new Solution2().addTwoNumbers(l1, l2);
		LinkedUtils.print(root);
	}
}