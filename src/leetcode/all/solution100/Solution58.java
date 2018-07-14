package leetcode.all.solution100;

/**
 * 58. 最后一个单词的长度.
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution58 {

    /**
     * 很简单，切分为数组，取最后一个元素即可
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0) return 0;
        String[] a=s.trim().split(" +");
        if(a==null||a.length==0) return 0;
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int r = new Solution58().lengthOfLastWord(s);
        System.out.println(r);
    }
}
