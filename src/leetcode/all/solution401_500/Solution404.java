package leetcode.all.solution401_500;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 404. 左叶子之和
 *
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)) return 0;
        return sum(root,1);
    }

    /**
     * 求左叶子节点的和
     * @param root
     * @param left 1：左节点，0：右节点
     * @return
     */
    public int sum(TreeNode root,int left) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null&&left==1) return root.val;
        return sum(root.left,1)+sum(root.right,0);
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTreeWith("3 9 # # 20 15 # # 7 # #"," ");
        int r=new Solution404().sumOfLeftLeaves(root);
        System.out.println(r);
    }
}
