package offer;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 二叉树的镜像
 *
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 *
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class MirrorSolution {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;

            Mirror(root.left);
            Mirror(root.right);
        }
    }

    public static void main(String[] args){
        String str="8,6,5,#,#,7,#,#,10,9,#,#,11,#,#";
        TreeNode root=TreeUtils.stringToTreeWith(str,",");
        new MirrorSolution().Mirror(root);
        TreeUtils.travser(root);
    }
}
