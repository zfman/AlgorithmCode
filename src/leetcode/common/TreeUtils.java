package leetcode.common;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class TreeUtils {

    public static int k=0;

    public static int k2=0;

    /**
     * 根据string创建树：节点的值小于等于9
     *
     *
     * @param s 先序的序列，空使用#表示
     * @return
     */
    public static TreeNode stringToTree(String s){
        k=0;
        TreeNode root=null;
        root=createTree(root,s);
        return root;
    }

    private static TreeNode createTree(TreeNode node,String s){
        char ch=s.charAt(k++);
        if(ch=='#') return null;
        else{
            node=new TreeNode(ch-'0');
            node.left=createTree(node.left,s);
            node.right=createTree(node.right,s);
            return node;
        }
    }

    /**
     * 符号以空格分隔，节点上的值可以大于9
     * @param str
     * @return
     */
    public static TreeNode stringToTreeWith(String str,String separator){
        k2=0;
        TreeNode root=null;
        String[] arr=str.trim().split(separator);
        root=createTreeWith(root,arr);
        return root;
    }

    private static TreeNode createTreeWith(TreeNode node,String[] arr){
        String v=arr[k2++];
        if(v.equals("#")) return null;
        else{
            node=new TreeNode(Integer.valueOf(v));
            node.left=createTreeWith(node.left,arr);
            node.right=createTreeWith(node.right,arr);
            return node;
        }
    }

    /**
     * 先序遍历
     * @param root
     */
    public static void travser(TreeNode root){
        if(root!=null){
            System.out.print(root.val+" ");
            travser(root.left);
            travser(root.right);
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    public static void travser2(TreeNode root){
        if(root!=null){
            travser2(root.left);
            System.out.print(root.val+" ");
            travser2(root.right);
        }
    }

    /**
     * 后序遍历
     * @param root
     */
    public static void travser3(TreeNode root){
        if(root!=null){
            travser3(root.left);
            travser3(root.right);
            System.out.print(root.val+" ");
        }
    }
}
