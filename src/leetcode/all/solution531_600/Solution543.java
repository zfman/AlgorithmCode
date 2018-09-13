package leetcode.all.solution531_600;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 543. 二叉树的直径
 *
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution543 {
    private int maxVal=0;
    public int diameterOfBinaryTree(TreeNode root) {
        todo(root);
        return maxVal;
    }

    /**
     * 以root为起始点，计算左右子树的深度之和，记录最大值
     * @param root
     */
    public void todo(TreeNode root) {
        if(root!=null){
            int v=depth(root.left)+depth(root.right);
            if(v>maxVal) maxVal=v;
            todo(root.left);
            todo(root.right);
        }
    }

    /**
     * 求解树深度
     * @param root
     * @return
     */
    public int depth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(depth(root.left),depth(root.right))+1;
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTree("124##5##3##");
        int r=new Solution543().diameterOfBinaryTree(root);
        System.out.println(r);
    }
}
