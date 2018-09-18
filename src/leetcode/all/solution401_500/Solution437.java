package leetcode.all.solution401_500;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 437. 路径总和 III
 *
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 示例：
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution437 {
    private int pathCount=0;

    public int pathSum(TreeNode root, int sum) {
        todo(root,sum);
        return pathCount;
    }

    /**
     * 以root为起始点开始计算路径长度
     * @param root
     * @param sum
     */
    public void todo(TreeNode root, int sum) {
        if(root!=null){
            doThing(root,sum,0);
            todo(root.left,sum);
            todo(root.right,sum);
        }
    }

    public void doThing(TreeNode node, int sum,int now) {
        if(node==null) return;
        if(now+node.val==sum) pathCount++;
        if(node.left!=null||node.right!=null){
            doThing(node.left,sum,now+node.val);
            doThing(node.right,sum,now+node.val);
        }
    }

    public static void main(String[] args){
        // sout:3
        TreeNode root=TreeUtils.stringToTreeWith("5 4 11 7 # # 2 # # # 8 13 # # 4 5 # # 1 # #"," ");
        int sum=22;
        int r=new Solution437().pathSum(root,sum);
        System.out.println(r);
    }
}
