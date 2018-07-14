package leetcode.all;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return adjust(root, 0, sum);
    }

    public boolean adjust(TreeNode root, int s, int target) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                s += root.val;
                if (target == s) {
                    return true;
                }
            }
            boolean b1 = adjust(root.left, root.val + s, target);
            boolean b2 = adjust(root.right, root.val + s, target);
            if (b1 || b2) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "5,4,11,7,#,#,2,#,#,#,8,13,#,#,4,#,1,#,#";
        int sum = 22;
        TreeNode root = TreeUtils.stringToTreeWith(s, ",");
        boolean r = new Solution112().hasPathSum(root, sum);
        System.out.println(r);
    }
}
