package leetcode.all.solution301_400;

/**
 * 303. 区域和检索 - 数组不可变
 *
 * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
 *
 * 示例：
 *
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * 说明:
 *
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 *
 * 两种方法
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution303 {
    public static void main(String[] args) {
        int[] nums = {
                -2, 0, 3, -5, 2, -1
        };
        NumArray array = new NumArray(nums);
        int r1 = array.sumRange(0,2);
        int r2=array.sumRange(2,5);
        int r3=array.sumRange(0,5);
        System.out.println("Method1:"+r1+" "+r2+" "+r3);

        NumArray2 array2 = new NumArray2(nums);
        int m1 = array.sumRange(0,2);
        int m2=array.sumRange(2,5);
        int m3=array.sumRange(0,5);
        System.out.println("Method2:"+m1+" "+m2+" "+m3);
    }
}

/**
 * 第一种方法
 */
class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums=nums;
    }

    public int sumRange(int i, int j) {
        if(i<0||j>=nums.length||i>j) return 0;
        int sum=0;
        for(;i<=j;i++){
            sum+=nums[i];
        }
        return sum;
    }
}

/**
 * 第二种方法，推荐
 *
 * 由于数组是不可变的，所以在构造函数初始化时将上一个元素与当前值的和给计算出来
 */
class NumArray2 {

    int[] sum;

    public NumArray2(int[] nums) {
        sum=new int[nums.length+1];
        sum[0]=0;
        for(int i=1;i<sum.length;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }
    }

    public int sumRange(int i, int j) {
        return sum[j+1]-sum[i];
    }
}
