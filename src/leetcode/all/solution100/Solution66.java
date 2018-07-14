package leetcode.all.solution100;

/**
 * 66. 加一.
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 *
 * 示例 2:
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution66 {

    /**
     * 从后往前计算，如果该位小于9，直接加1，停止
     * 如果等于9，置0，继续向前计算.
     * 注意边界值，如果超出，需要扩容，高位补1
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        for(;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                break;
            }else {
                digits[i]=0;
            }
        }
        if(i<0){
            int[] r=new int[digits.length+1];
            r[0]=1;
            for(int m=1;m<r.length;m++){
                r[m]=digits[m-1];
            }
            return r;
        }
        return digits;
    }

    public static void main(String[] args){
        int[] digits={
                9,9,9,9
        };
        int[] r=new Solution66().plusOne(digits);
        for (int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
