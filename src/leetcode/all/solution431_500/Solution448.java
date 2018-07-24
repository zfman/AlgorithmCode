package leetcode.all.solution431_500;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 *
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 *
 * 示例:
 *
 * 输入:
 * [4,3,2,7,8,2,3,1]
 *
 * 输出:
 * [5,6]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution448 {

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
            if(v[i]==0) r.add(i);
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums = {
                4, 3, 2, 7, 8, 2, 3, 1
        };
        List<Integer> r = new Solution448().findDuplicates(nums);
        for (Integer i : r) {
            System.out.print(i + " ");
        }
    }
}
