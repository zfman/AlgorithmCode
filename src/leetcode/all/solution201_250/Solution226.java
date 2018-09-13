package leetcode.all.solution201_250;

import leetcode.common.TreeNode;
import leetcode.common.TreeUtils;

/**
 * 226. 翻转二叉树
 *
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 *
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        doThing(root);
        return root;
    }

    public void doThing(TreeNode root) {
        if(root!=null){
            doThing(root.left);
            doThing(root.right);
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;
        }
    }

    public static void main(String[] args){
        TreeNode root=TreeUtils.stringToTree("421##3##76##9##");
        TreeNode r=new Solution226().invertTree(root);
        TreeUtils.travser(r);
    }
}
