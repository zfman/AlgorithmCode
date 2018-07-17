package offer;

import leetcode.common.LinkedUtils;
import leetcode.common.ListNode;

/**
 * 两个链表的第一个公共结点
 *
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class FindFirstCommonNodeSolution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int m=0,n=0;
        ListNode p1=pHead1,p2=pHead2;
        while (p1!=null){
            p1= p1.next;
            m++;
        }

        while (p2!=null){
            p2= p2.next;
            n++;
        }

        p1=pHead1;
        p2=pHead2;

        int k=0;
        if(m>n){
            while(k<m-n){
                p1=p1.next;
                k++;
            }
        }else{
            while(k<n-m){
                p2=p2.next;
                k++;
            }
        }

        while (p1!=null&&p2!=null){
            if(p1==p2) return p1;
            p1=p1.next;
            p2=p2.next;
        }
        return null;
    }

    public static void main(String[] args){
        int[] arr1={
                1,2,3
        };
        int[] arr2={
                4,5
        };
        int[] arr3={
                7,8,9
        };

        ListNode node1=LinkedUtils.arrayToLinkedList(arr1);
        ListNode node2=LinkedUtils.arrayToLinkedList(arr2);
        ListNode node3=LinkedUtils.arrayToLinkedList(arr3);

        node1.next=node3;
        node2.next=node3;

        ListNode r=new FindFirstCommonNodeSolution().FindFirstCommonNode(node1,node2);
        LinkedUtils.print(r);
    }
}
