package offer;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;
import sort.ArrayUtils;

/**
 * 反转链表
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ReverseListSolution {
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        //pr:指向要反转的下一个元素
        //p:指向当前正在反转的元素
        //q:指向上一个反转的元素
        ListNode pr=head,p=head,q=null;
        while (pr!=null){
            pr=p.next;
            p.next=q;
            q=p;
            p=pr;
        }
        head=q;
        return head;
    }

    public static void main(String[] args){
        int[] array={
                1,2,3,4,5,6
        };
        ListNode head=LinkedUtils.arrayToLinkedList(array);
        ListNode r=new ReverseListSolution().ReverseList(head);
        LinkedUtils.print(r);
    }
}
