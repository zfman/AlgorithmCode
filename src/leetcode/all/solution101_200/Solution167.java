package leetcode.all.solution101_200;

/**
 * 167. 两数之和 II - 输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution167 {

    /**
     * 使用了一个比较笨的方法：
     * 从第1个数开始，分别与之后的数字求和
     *
     * 注意：这个方法如果不优化的话是过不了测试集的，有个测试集非常的长
     * 优化：去掉无用的比较，如果发现sum>target，那么本轮就没有继续比较的必要了
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] r = new int[2];
        if (numbers == null || numbers.length == 0) return r;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if(sum>target) break;
                if (sum == target) {
                    r[0] = i + 1;
                    r[1] = j + 1;
                    return r;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] numbers = {
                3,24,50,79,88,150,345
        };
        int target = 200;
        int[] r = new Solution167().twoSum(numbers, target);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
