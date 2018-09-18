package leetcode.all.solution601_700;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * 653. 两数之和 IV - 输入 BST
 *
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 * 案例 1:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * 输出: True
 *
 *
 * 案例 2:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * 输出: False
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution653 {

    /**
     * 我的思路是：把树中元素存储到集合中，然后对集合二重循环求解和
     *
     * 以下是别人的思路，代码很简洁高效，学习学习
     *
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet<>();
        return todo(root,k,set);
    }

    public boolean todo(TreeNode root, int k, Set<Integer> set) {
        if(root==null) return false;
        if(set.contains(k-root.val)) return true;
        set.add(root.val);
        return todo(root.left,k,set)||todo(root.right,k,set);
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTree("532##4##6#7##");
        boolean r=new Solution653().findTarget(root,9);
        System.out.println(r);
    }
}
