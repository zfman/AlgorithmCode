package leetcode.all.solution100;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 100. 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 *
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 *
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //p,q不一致
        if(p==null&&q!=null) return false;
        if(p!=null&&q==null) return false;

        //判断左子树、右子树
        if(p!=null&&q!=null){
            if(!isSameTree(p.left,q.left)||!isSameTree(p.right,q.right)) return false;
            if(p.val!=q.val) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pstr="12##4##";
        String qstr="12##3##";
        TreeNode p=TreeUtils.stringToTree(pstr);
        TreeNode q=TreeUtils.stringToTree(qstr);
        boolean b = new Solution100().isSameTree(p, q);
        System.out.println(b);
    }
}
