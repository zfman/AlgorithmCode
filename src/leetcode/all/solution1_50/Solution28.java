package leetcode.all.solution1_50;

/**
 * 28. 实现strStr().
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 示例 2:
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution28 {

    /**
     * 暴力法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len2==0) return 0;
        else if(len1==0) return -1;

        int i=0,j=0;
        while(i<len1&&j<len2){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }

        if(j>=len2) return i-len2;
        return -1;
    }

    public static void main(String[] args) {
        String haystack="";
        String needle="ll";
        int r=new Solution28().strStr(haystack,needle);
        System.out.println(r);
    }
}
