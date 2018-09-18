package leetcode.all.solution501_600;

import java.util.ArrayList;
import java.util.List;

/**
 * 559. N叉树的最大深度
 *
 * 给定一个N叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 * https://leetcode-cn.com/static/images/problemset/NaryTreeExample.png
 *
 * 我们应返回其最大深度，3。
 *
 * 说明:
 *
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution559 {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        if(root.children==null) return 1;
        int max=0;
        for(Node node:root.children){
            int t=maxDepth(node);
            if(t>max) max=t;
        }
        return max+1;
    }

    public static void main(String[] args){
        Node node5=new Node(5,null);
        Node node6=new Node(6,null);
        List<Node> children3=new ArrayList<>();
        children3.add(node5);
        children3.add(node6);

        Node node3=new Node(3,children3);
        Node node2=new Node(2,null);
        Node node4=new Node(4,null);

        List<Node> children1=new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        Node root=new Node(1,children1);

        int r=new Solution559().maxDepth(root);
        System.out.println(r);
    }
}
