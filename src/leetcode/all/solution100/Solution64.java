package leetcode.all.solution100;

/**
 * 64. 最小路径和
 *
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        if(grid.length<1) return 0;

        int m=grid.length;
        int n=grid[0].length;

        //存储最小的路径和
        int[][] arr=new int[m][n];
        //对第一列、第一行进行初始化
        for(int i=0;i<m;i++){
            if(i==0) arr[i][0]=grid[i][0];
            else arr[i][0]=arr[i-1][0]+grid[i][0];
        }
        for(int i=0;i<n;i++){
            if(i==0) arr[0][i]=grid[0][i];
            else arr[0][i]=arr[0][i-1]+grid[0][i];
        }

        //上侧、左侧取最小值与当前值相加
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=Math.min(arr[i-1][j],arr[i][j-1])+grid[i][j];
            }
        }

        return arr[m-1][n-1];
    }
    public static void main(String[] args){
        int[][] grid={
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        int r=new Solution64().minPathSum(grid);
        System.out.println(r);
    }
}
