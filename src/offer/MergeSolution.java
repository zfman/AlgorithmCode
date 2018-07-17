package offer;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 合并两个排序的链表
 *
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class MergeSolution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode(0);
        ListNode tmp=list3;

        while (list1!=null&&list2!=null){
            if(list2.val>list1.val){
                tmp.next=list1;
                tmp=tmp.next;
                list1=list1.next;
            }else {
                tmp.next=list2;
                tmp=tmp.next;
                list2=list2.next;
            }
        }

        if(list1==null){
            tmp.next=list2;
        }
        if(list2==null){
            tmp.next=list1;
        }
        return list3.next;
    }

    public static void main(String[] args){
        int[] arr1={
                4,8,9
        };
        int[] arr2={
                1,6,7
        };
        ListNode list1=LinkedUtils.arrayToLinkedList(arr1);
        ListNode list2=LinkedUtils.arrayToLinkedList(arr2);

        ListNode r=new MergeSolution().Merge(list1,list2);
        LinkedUtils.print(r);
    }
}
