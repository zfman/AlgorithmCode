package leetcode.all.solution1_100;

/**
 * 35. 搜索插入位置.
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 *
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution35 {

    public int searchInsert(int[] nums, int target) {
        return binSearch(nums,0,nums.length-1,target);
    }

    /**
     * 二分查找
     * @param nums 数组
     * @param low 低位
     * @param high 高位
     * @param value 待查找值
     * @return 位置，未找到返回low
     */
    public int binSearch(int[] nums,int low,int high,int value){
        int middle=low+(high-low)/2;
        if(low>high) return low;
        if(value==nums[middle]) return middle;
        else if(value<nums[middle]) return binSearch(nums,low,middle-1,value);
        else return binSearch(nums,middle+1,high,value);
    }

    public static void main(String[] args) {
        int[] nums = {
                1, 3, 5, 6
        };
        int target = 0;
        int r = new Solution35().searchInsert(nums, target);
        System.out.println(r);
    }
}
