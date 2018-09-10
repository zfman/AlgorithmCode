package leetcode.all.solution631_700;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 687. 最长同值路径
 *
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution687 {
    private int max=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root!=null) dfs(root,root.val-1);
        return max;
    }

    public int dfs(TreeNode node,int val){
        if(node==null) return 0;
        int left=dfs(node.left,node.val);
        int right=dfs(node.right,node.val);
        int v1=left+right;
        int v2=Math.max(left,right);
        max=Math.max(Math.max(v1,v2),max);
        if(node.val==val) return v2+1;
        return 0;
    }

    public static void main(String[] args){
//        TreeNode root=TreeUtils.stringToTree("144##4##55###");
        TreeNode root=TreeUtils.stringToTree("11###");
        int r=new Solution687().longestUnivaluePath(root);
        System.out.println(r);
    }
}
