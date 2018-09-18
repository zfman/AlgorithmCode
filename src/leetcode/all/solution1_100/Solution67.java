package leetcode.all.solution1_100;

/**
 * 67. 二进制求和.
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 * 输入: a = "11", b = "1"
 * 输出: "100"
 *
 * 示例 2:
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution67 {

    /**
     * 先补空位，然后从后往前计算和
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int max = Math.max(a.length(), b.length());
        int d = 0;
        if (a.length() < max) {
            d = max - a.length();
            for (int i = 0; i < d; i++) a = "0" + a;
        }

        if (b.length() < max) {
            d = max - b.length();
            for (int i = 0; i < d; i++) b = "0" + b;
        }

        String r = "";
        int i=max-1;
        boolean plusOne=false;
        for (; i >= 0; i--) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            int k=ch1-'0'+(ch2-'0');
            if(plusOne) k=k+1;
            if (k>1) {
                k=k-2;
                r = k+ r;
                plusOne=true;
            } else {
                r=k+r;
                plusOne=false;
            }
        }
        if(i<0&&plusOne){
            r="1"+r;
        }
        return r;
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String r = new Solution67().addBinary(a, b);
        System.out.println(r);//10101
    }
}
