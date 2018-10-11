package leetcode.all.solution301_400;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution349 {
    /**
     * 利用哈希表或者
     * 先排序后使用双指针，如果指针指向相同，说明出现一个交集元素
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        Set<Integer> set = new HashSet<>();//去重
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) map.put(nums1[i], 0);
            else map.put(nums1[i], map.get(nums1[i]) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }

        int[] r = new int[set.size()];
        int i = 0;
        for (Integer val : set) {
            r[i++] = val;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] nums1 = {
                4, 9, 5
        };
        int[] nums2 = {
                9, 4, 9, 8, 4
        };
        int[] r = new Solution349().intersection(nums1, nums2);
        ArrayUtils.printArray(r);
    }
}
