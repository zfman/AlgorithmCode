package leetcode.common;

/**
 * 链表工具类
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class LinkedLists {
	public static ListNode arrayToLinkedList(int[] array){
		if(array==null) return null;
		//head node 
		ListNode root=new ListNode(-1);
		ListNode p=root;
		
		int size=array.length;
		int i=0;
		while(i<size){
			ListNode q=new ListNode(array[i++]);
			q.next=null;
			p.next=q;
			p=q;
		}
		
		return root.next;
	}
	
	public static void print(ListNode root) {
		if(root==null) System.out.println("root is null");
		else{
			while(root!=null){
				System.out.print(root.val);
				if(root.next!=null){
					System.out.print("->");
				}
				root=root.next;
			}
			System.out.println();
		}
	}
}
