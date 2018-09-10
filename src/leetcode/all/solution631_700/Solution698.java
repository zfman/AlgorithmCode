package leetcode.all.solution631_700;

/**
 * 698. 划分为k个相等的子集
 *
 * 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。
 *
 * 示例 1：
 *
 * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
 * 输出： True
 * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 *
 *
 * 注意:
 *
 * 1 <= k <= len(nums) <= 16
 * 0 < nums[i] < 10000
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k==1) return true;
        if(k>nums.length) return false;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k!=0) return false;
        boolean[] visited=new boolean[nums.length];
        return todo(nums,k,0,0,sum/k,visited,0);
    }

    public boolean todo(int[] nums,int k,int start,int curSum,int target,boolean[] v,int number){
        if(curSum>target) return false;
        if(k==0&&nums.length==number) return true;
        if(curSum==target) return todo(nums,k-1,0,0,target,v,number);
        for(int i=start;i<nums.length;i++){
            if(!v[i]){
                v[i]=true;
                if(todo(nums,k,start+1,curSum+nums[i],target,v,number+1)) return true;
                v[i]=false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {
                4, 3, 2, 3, 5, 2, 2
        };
        int k = 100;
        boolean b = new Solution698().canPartitionKSubsets(nums, k);
        System.out.println(b);
    }
}
