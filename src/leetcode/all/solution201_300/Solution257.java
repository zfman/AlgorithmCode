package leetcode.all.solution201_300;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        todo(root,list,"");
        return list;
    }

    public void todo(TreeNode root,List<String> list,String s) {
        String tmp=(s.length()==0?"":s+"->");
        if(root!=null){
            if(root.left==null&&root.right==null) {
                list.add(tmp+root.val);
            }else{
                todo(root.left,list,tmp+root.val);
                todo(root.right,list,tmp+root.val);
            }
        }
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTree("12#5##3##");
        List<String> r=new Solution257().binaryTreePaths(root);
        for(String s:r){
            System.out.println(s);
        }
    }
}
