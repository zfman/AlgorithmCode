package leetcode.all.solution1_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 *
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *
 * 注意：
 *
 * 答案中不可以包含重复的四元组。
 *
 * 示例：
 *
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;//对第1个数去重
            for (int j = i + 1; j < nums.length ; j++) {
                if(j>i+1&&nums[j]==nums[j-1]) continue;//对第2个数去重
                int k = j + 1;//前指针
                int v = nums.length - 1;//后指针
                while (k < v) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[v];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[v]));
                        //去重
                        while (k < v && nums[k] == nums[k + 1]) k++;
                        while (k < v && nums[v] == nums[v - 1]) v--;
                        k++;
                        v--;
                    } else if (sum > target) {
                        v--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {
                -1,2,2,-5,0,-1,4
        };
        int target = 3;
        List<List<Integer>> r = new Solution18().fourSum(nums, target);
        for (List<Integer> l : r) {
            for (Integer i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
