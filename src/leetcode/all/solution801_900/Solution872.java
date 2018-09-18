package leetcode.all.solution801_900;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. 叶子相似的树
 *
 * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 *
 * https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png
 *
 * 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。
 *
 * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 *
 * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
 *
 * 提示：
 *
 * 给定的两颗树可能会有 1 到 100 个结点。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        todo(root1,list1);
        todo(root2,list2);
        if(list1.toString().equals(list2.toString())) return true;
        return false;
    }

    public void todo(TreeNode root, List<Integer> list) {
        if(root!=null){
            if(root.left==null&&root.right==null){
               list.add(root.val);
            }
            todo(root.left,list);
            todo(root.right,list);
        }
    }

    public static void main(String[] args){
        TreeNode root1=TreeUtils.stringToTree("12##3##");
        TreeNode root2=TreeUtils.stringToTree("13##2##");
        boolean b=new Solution872().leafSimilar(root1,root2);
        System.out.println(b);
    }
}
