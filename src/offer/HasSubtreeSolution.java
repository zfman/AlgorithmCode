package offer;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 树的子结构
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class HasSubtreeSolution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null) return false;
        return isSubtree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }

    public boolean isSubtree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null) return false;
        return root1.val==root2.val&&isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
    }

    public static void main(String[] args) {
        String treeStr1 = "889##24##7##7##";
        String treeStr2 = "89##2##";
        TreeNode root1=TreeUtils.stringToTree(treeStr1);
        TreeNode root2=TreeUtils.stringToTree(treeStr2);
        boolean r=new HasSubtreeSolution().HasSubtree(root1,root2);
        System.out.println(r);
    }
}
