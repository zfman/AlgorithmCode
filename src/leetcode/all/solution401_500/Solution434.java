package leetcode.all.solution401_500;

/**
 * 434. 字符串中的单词数
 *
 * 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
 *
 * 请注意，你可以假定字符串里不包括任何不可打印的字符。
 *
 * 示例:
 *
 * 输入: "Hello, my name is John"
 * 输出: 5
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution434 {
    public int countSegments(String s) {
        if(s==null) return 0;
        s=s.trim();
        if(s.length()==0) return 0;
        String[] a=s.trim().split(" +");
        return a.length;
    }
    public static void main(String[] args){
        String s="Hello, my name is John";
        int r=new Solution434().countSegments(s);
        System.out.println(r);
    }
}
