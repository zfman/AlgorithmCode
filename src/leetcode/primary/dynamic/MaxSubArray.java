package leetcode.primary.dynamic;

/**
 * 最大子序和.
 * 
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 * 
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class MaxSubArray {
	
	/**
	 * 最大子序和.
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;
		int pos1 = 0;
		int pos2 = 0;
		int tmp = nums[0];
		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (tmp > 0) {
				tmp += nums[i];
				if (tmp > sum) {
					sum = tmp;
					pos2 = i;
				}
			} else {
				tmp = nums[i];
				if (tmp > sum) {
					sum = tmp;
					pos1 = i;
					pos2 = i;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums={
			-2,1,-3,4,-1,2,1,-5,4
		};
		int r=new MaxSubArray().maxSubArray(nums);
		System.out.println(r);
	}
}
