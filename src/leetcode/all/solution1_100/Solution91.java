package leetcode.all.solution1_100;

/**
 * 91. 解码方法
 *
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 *
 * 示例 1:
 *
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 *
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution91 {

    /**
     * 1.长度小于1，返回0
     * 2.dp的长度比字符串长度多一个，第一位默认为1
     * 3.对s中的每个字符：
     *   ch为'0'，该位置为0，否则，为上一个值
     *   如果可以和上个元素组合为符合的数字，
     *   那么该位置等于该位置的值+上上个位置的值
     *
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        if(s==null||s.length()<1) return 0;
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        for(int i=1;i<=s.length();i++){
            dp[i]=s.charAt(i-1)=='0'?0:dp[i-1];
            if(i>1&&(s.charAt(i-2)=='1'||(s.charAt(i-2)=='2'&&s.charAt(i-1)<='6'))){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        String s="110";
        int r=new Solution91().numDecodings(s);
        System.out.println(r);
    }
}
