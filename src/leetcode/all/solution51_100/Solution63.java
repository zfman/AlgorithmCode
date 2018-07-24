package leetcode.all.solution51_100;

/**
 * 63. 不同路径 II
 *
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 *
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution63 {
    /**
     * 本题目增加了障碍物，所以在初始化时需要注意
     *
     * 初始化时将第一行、第一列障碍物位置以及其之后的位置初始化为0，其他位置为1
     * 计算时，如果该位置为障碍物，置0，否则置为上策和左侧的和
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length<1) return 0;
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] count=new int[m][n];

        //初始化
        boolean cannotContinue1=false;
        boolean cannotContinue2=false;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1) cannotContinue1=true;
            if(cannotContinue1) count[i][0]=0;
            else count[i][0]=1;
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1) cannotContinue2=true;
            if(cannotContinue2) count[0][i]=0;
            else count[0][i]=1;
        }

        //计算
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    count[i][j]=0;
                }else{
                    count[i][j]=count[i-1][j]+count[i][j-1];
                }
            }
        }
        return count[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0}
        };
        int r = new Solution63().uniquePathsWithObstacles(arr);
        System.out.println(r);//0
    }
}
