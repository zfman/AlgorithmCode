package leetcode.all.solution1_100;

import java.util.Arrays;

/**
 *
 * 16. 最接近的三数之和
 *
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution16 {

    /**
     * 双指针，类似 Solution15
     * 不需要去重
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int minDistance=Integer.MAX_VALUE;//最小距离
            int minSum=0;//最小和
            for(int i=0;i<nums.length-2;i++){
                int k=i+1;//前指针
                int v=nums.length-1;//后指针
                while(k<v){
                    int sum=nums[i]+nums[k]+nums[v];
                    if(sum==target) return sum;
                    else if(sum>target){
                        v--;
                    }else{
                        k++;
                    }
                    //保存最小和、最小距离
                    if(Math.abs(sum-target)<minDistance){
                        minDistance=Math.abs(sum-target);
                        minSum=sum;
                    }
                }
            }
            return minSum;
    }
    public static void main(String[] args){
        int[] nums={
                -1,2,1,-4
        };
        int target=1;
        int r=new Solution16().threeSumClosest(nums,target);
        System.out.println(r);//output:2
    }
}
