package leetcode.all.solution531_600;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 563. 二叉树的坡度
 *
 * 给定一个二叉树，计算整个树的坡度。
 *
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 *
 * 整个树的坡度就是其所有节点的坡度之和。
 *
 * 示例:
 *
 * 输入:
 *          1
 *        /   \
 *       2     3
 * 输出: 1
 * 解释:
 * 结点的坡度 2 : 0
 * 结点的坡度 3 : 0
 * 结点的坡度 1 : |2-3| = 1
 * 树的坡度 : 0 + 0 + 1 = 1
 * 注意:
 *
 * 任何子树的结点的和不会超过32位整数的范围。
 * 坡度的值不会超过32位整数的范围。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution563 {
    /**
     * 计算各个节点的坡度和
     * @param root
     * @return
     */
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        return findTilt(root.left)+findTilt(root.right)+Math.abs(todo(root.left)-todo(root.right));
    }

    /**
     * 计算以root为起始点的坡度值
     * @param root
     * @return
     */
    public int todo(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null){
            return root.val;
        }
        return root.val+todo(root.left)+todo(root.right);
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTree("124###35###");
        int r=new Solution563().findTilt(root);
        System.out.println(r);
    }
}
