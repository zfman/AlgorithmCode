package leetcode.all.solution301_400;

/**
 * 304. 二维区域和检索 - 矩阵不可变
 *
 * 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2)。
 *
 * Range Sum Query 2D
 * 上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。
 *
 * 示例:
 *
 * 给定 matrix = [
 *   [3, 0, 1, 4, 2],
 *   [5, 6, 3, 2, 1],
 *   [1, 2, 0, 1, 5],
 *   [4, 1, 0, 1, 7],
 *   [1, 0, 3, 0, 5]
 * ]
 *
 * sumRegion(2, 1, 4, 3) -> 8
 * sumRegion(1, 1, 2, 2) -> 11
 * sumRegion(1, 2, 2, 4) -> 12
 * 说明:
 *
 * 你可以假设矩阵不可变。
 * 会多次调用 sumRegion 方法。
 * 你可以假设 row1 ≤ row2 且 col1 ≤ col2。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution304 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix numMatrix= new NumMatrix(matrix);
        int m1 = numMatrix.sumRegion(2, 1, 4, 3);
        int m2 = numMatrix.sumRegion(1, 1, 2, 2);
        int m3 = numMatrix.sumRegion(1, 2, 2, 4);
        System.out.println("Method2:" + m1 + " " + m2 + " " + m3);
    }
}

/**
 * 必须使用高效的算法，否则通不过的
 */
class NumMatrix {

    //dp[i][j]：从(0,0)->(i,j)围成的矩形的和
    int[][] dp;

    public NumMatrix(int[][] matrix) {
        if(matrix.length<=0||matrix[0].length<=0){
            this.dp=null;
            return;
        }
        this.dp=new int[matrix.length][matrix[0].length];

        //初始化，按行累加
        for(int i=0;i<dp.length;i++){
            dp[i][0]=matrix[i][0];
            for(int j=1;j<dp[i].length;j++){
                dp[i][j]=dp[i][j-1]+matrix[i][j];
            }
        }

        //按列累加，修正值
        for(int j=0;j<dp[0].length;j++){
            for(int i=1;i<dp.length;i++){
                dp[i][j]=dp[i-1][j]+dp[i][j];
            }
        }
    }

    /**
     * dp[i][j]：从(0,0)->(i,j)围成的矩形的和.
     * 取值的时候需要注意边界值
     *
     * @param row1 起始行
     * @param col1 起始列
     * @param row2 终止行
     * @param col2 中止列
     * @return
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(dp==null) return 0;
        if(row1==0){
            if(col1==0){
                return dp[row2][col2];
            }
            return dp[row2][col2]-dp[row2][col1-1];
        }else{
            if(col1==0){
                return dp[row2][col2]-dp[row1-1][col2];
            }
            return dp[row2][col2]-dp[row1-1][col2]-dp[row2][col1-1]+dp[row1-1][col1-1];
        }
    }
}
