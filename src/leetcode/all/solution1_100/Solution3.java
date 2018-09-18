package leetcode.all.solution1_100;

/**
 * 无重复字符的最长子串.
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null) return 0;
        if(s.length()<2) return s.length();


        return 0;
    }

    public static void main(String[] args){
        String s="";
        int r=new Solution3().lengthOfLongestSubstring(s);
        System.out.println(r);
    }
}
