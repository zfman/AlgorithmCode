package leetcode.all.solution401_500;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. 数组中重复的数据
 *
 * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 *
 * 找到所有出现两次的元素。
 *
 * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
 *
 * 示例：
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [2,3]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution442 {

    /**
     * 使用桶排序的思想（不需要排序）.
     * 这句话是关键：1 ≤ a[i] ≤ n （n为数组长度）,
     * v[i]:桶，下标与nums[i]值对应
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> r = new ArrayList<>();
        int[] v=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            v[nums[i]]++;
        }
        for(int i=1;i<v.length;i++){
            if(v[i]>=2) r.add(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = {
                4, 3, 2, 7, 8, 2, 3, 1
        };
        List<Integer> r = new Solution442().findDuplicates(nums);
        for (Integer i : r) {
            System.out.print(i + " ");
        }
    }
}
