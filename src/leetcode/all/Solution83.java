package leetcode.all;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 83. 删除排序链表中的重复元素.
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 * 输入: 1->1->2
 * 输出: 1->2
 *
 * 示例 2:
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution83 {
    /**
     * 从第二个元素开始，和它之前的元素比较，
     * 如果相同，删除当前节点，继续比较直至末尾
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p=head,q=null;
        while(p!=null){
            if(q!=null&&p.val==q.val) {
                q.next=p.next;
                p=q.next;
            }else{
                q=p;
                p=p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] array={
                1,1,2,2,2,2,2
        };
        ListNode head=LinkedUtils.arrayToLinkedList(array);
        ListNode r=new Solution83().deleteDuplicates(head);
        LinkedUtils.print(r);
    }
}
