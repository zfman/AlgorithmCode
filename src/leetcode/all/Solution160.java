package leetcode.all;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 160. 相交链表
 * 编写一个程序，找到两个单链表相交的起始节点。
 *
 *
 *
 * 例如，下面的两个链表：
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 *
 *
 *
 * 注意：
 *
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 *
 *
 * 致谢:
 * 特别感谢 @stellari 添加此问题并创建所有测试用例。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution160 {

    /**
     * 求出两个链表的长度m,n，长链表的指针先走|n-m|，然后再同步走
     * 两个链表相交，那么相交部分的长度是相同的
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        int lenA=length(headA);
        int lenB=length(headB);
        ListNode nodeA=headA;
        ListNode nodeB=headB;
        int k=0;

        if(lenA>lenB){
            while(k<lenA-lenB){
                nodeA=nodeA.next;
                k++;
            }
        }else{
            while (k<lenB-lenA){
                nodeB=nodeB.next;
                k++;
            }
        }

        while(nodeA!=null&&nodeB!=null){
            if(nodeA==nodeB) return nodeA;
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return null;
    }

    public int length(ListNode root) {
        if(root==null) return 0;
        int n=0;
        while(root!=null){
            root=root.next;
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a={
                1,2
        };
        int[] b={
                3,4,5
        };
        int[] c={
                6,7,8
        };

        ListNode headA = LinkedUtils.arrayToLinkedList(a);
        ListNode headB = LinkedUtils.arrayToLinkedList(b);
        ListNode headC=LinkedUtils.arrayToLinkedList(c);//公共部分

        ListNode tailA=LinkedUtils.moveToTail(headA);
        ListNode tailB=LinkedUtils.moveToTail(headB);
        tailA.next=headC;
        tailB.next=headC;

        ListNode r = new Solution160().getIntersectionNode(headA, headB);
        LinkedUtils.print(r);//6->7->8
    }
}
