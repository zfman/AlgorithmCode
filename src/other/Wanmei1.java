package other;

/**
 * 完美世界-诱惑值
 * 格子n*n,每个位置都有一个诱惑值值，计算从左上到右下最小的诱惑值
 *
 * input:
 * 3
 * 1 3 7
 * 6 2 1
 * 9 8 0
 *
 * output:
 * 7
 *
 * 说明：第一行是n，表示矩阵为n行n列，之后的n行为每行的诱惑值
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Wanmei1 {
    public int todo(int[][] arr) {
        //初始化
        int[][] dp = new int[arr.length][arr.length];
        for (int i = 0; i < dp.length; i++) {
            if (i == 0) dp[0][i] = arr[0][i];
            else dp[0][i] = dp[0][i - 1] + arr[0][i];
        }
        for (int i = 0; i < dp.length; i++) {
            if (i == 0) dp[i][0] = arr[i][0];
            else dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        //从第2行，第2列开始，该位置最小诱惑值值等于左侧和上侧的最小值加上当前位置的诱惑值
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1])+arr[i][j];
            }
        }
        return dp[dp.length-1][dp.length-1];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 7},
                {6, 2, 1},
                {9,8,0}
        };
        int r=new Wanmei1().todo(arr);
        System.out.println(r);//7
    }
}
