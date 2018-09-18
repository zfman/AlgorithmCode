package leetcode.all.solution501_600;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 572. 另一个树的子树
 *
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 *
 * 示例 1:
 * 给定的树 s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 *
 * 示例 2:
 * 给定的树 s：
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 false。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return s!=null&&(isSubtree(s.left,t)||isSubtree(s.right,t)||isSample(s,t));
    }

    public boolean isSample(TreeNode s, TreeNode t) {
        if(s==null&&t==null) return true;
        else if(s==null||t==null) return false;
        else{
            return s.val==t.val&&isSample(s.left,t.left)&&isSample(s.right,t.right);
        }
    }

    public static void main(String[] args){
        TreeNode s=TreeUtils.stringToTree("341##2##5##");
        TreeNode t=TreeUtils.stringToTree("41##2##");
        boolean r=new Solution572().isSubtree(s,t);
        System.out.println(r);
    }
}
