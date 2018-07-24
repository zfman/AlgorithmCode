package leetcode.all.solution51_100;

/**
 * 69. x 的平方根
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 示例 1:
 * 输入: 4
 * 输出: 2
 *
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution69 {

    /**
     * 调用系统库
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }

    /**
     * 这个方法我还不太理解，备注
     * @param x
     * @return
     */
    public int mySqrt2(int x) {
        if(x<=1) return x;
        long m=x;
        while(m>x/m){
            m=(m+x/m)/2;
        }
        return (int)m;
    }

    public static void main(String[] args) {
        int x = 8;
        int r = new Solution69().mySqrt(x);
        int r2=new Solution69().mySqrt2(x);
        System.out.println("Method1:"+r);
        System.out.println("Method2:"+r2);
    }
}
