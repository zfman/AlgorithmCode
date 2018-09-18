package leetcode.all.solution301_400;

import java.util.Arrays;

/**
 * 354. 俄罗斯套娃信封问题
 *
 * 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 *
 * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 *
 * 说明:
 * 不允许旋转信封。
 *
 * 示例:
 *
 * 输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出: 3
 * 解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution354 {

    /**
     * 先对宽度递增排序，然后对高度计算“最长递增子序列的长度”
     * @param envelopes
     * @return
     */
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) return 0;
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);
        sort(envelopes);
        int max = 1;
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0]>envelopes[j][0]&&envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > max) max = dp[i];
        }
        return max;
    }

    public void sort(int[][] envelopes) {
        for (int i = 0; i < envelopes.length - 1; i++) {
            for (int j = i + 1; j < envelopes.length; j++) {
                if (envelopes[i][0] > envelopes[j][0]) {
                    int[] tmp = envelopes[i];
                    envelopes[i] = envelopes[j];
                    envelopes[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] envelopes = {
                {5,4},{6,4},{6,7},{2,3}
        };
//        2,4 5,4 6,4 6,7
//        1 1 1 1

        int r = new Solution354().maxEnvelopes(envelopes);
        System.out.println(r);
    }


}
