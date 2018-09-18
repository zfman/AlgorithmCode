package leetcode.all.solution1_100;

/**
 * 反转整数.
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * <p>
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * <p>
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * <p>
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution7 {

    /**
     * 用long保存结果.从低位开始计算,注意负数的处理
     * @param x
     * @return
     */
    public int reverse(int x) {
        int head=1;
        if(x<0) {
            x=-x;
            head=-1;
        }

        int t=x%10;
        long r=0;
        x=x/10;
        while(x!=0){
            r=(r+t)*10;
            t=x%10;
            x=x/10;
        }
        r=(r+t);

        if((head*r>(Math.pow(2,31)-1))||(head*r<-1*(Math.pow(2,31)-1))) return 0;
        return (int)(head*r);
    }

    public static void main(String[] args){
        int x=-123;
        int r=new Solution7().reverse(x);
        System.out.println(r);
    }
}
