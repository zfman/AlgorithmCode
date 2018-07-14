package leetcode.common;

/**
 * 链表工具类
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class LinkedUtils {

	/**
	 * 数组转化为链表
	 * @param array
	 * @return
	 */
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

	/**
	 * 打印链表
	 * @param root
	 */
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

	/**
	 * 求链表长度
	 * @param root
	 * @return
	 */
	public static int length(ListNode root) {
		if(root==null) return 0;
		int n=0;
		while(root!=null){
			root=root.next;
			n++;
		}
		return n;
	}

	/**
	 * 返回指向链表尾部的指针
	 * @param root
	 * @return
	 */
	public static ListNode moveToTail(ListNode root) {
		if(root==null) return null;
		ListNode tail=root;
		while(tail.next!=null){
			tail=tail.next;
		}
		return tail;
	}
}
