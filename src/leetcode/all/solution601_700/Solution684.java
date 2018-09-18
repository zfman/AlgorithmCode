package leetcode.all.solution601_700;

import utils.ArrayUtils;

/**
 * 684. 冗余连接
 *
 * 在本问题中, 树指的是一个连通且无环的无向图。
 *
 * 输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。
 *
 * 结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。
 *
 * 返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边 [u, v] 应满足相同的格式 u < v。
 *
 * 示例 1：
 *
 * 输入: [[1,2], [1,3], [2,3]]
 * 输出: [2,3]
 * 解释: 给定的无向图为:
 *   1
 *  / \
 * 2 - 3
 * 示例 2：
 *
 * 输入: [[1,2], [2,3], [3,4], [1,4], [1,5]]
 * 输出: [1,4]
 * 解释: 给定的无向图为:
 * 5 - 1 - 2
 *     |   |
 *     4 - 3
 * 注意:
 *
 * 输入的二维数组大小在 3 到 1000。
 * 二维数组中的整数在1到N之间，其中N是输入数组的大小。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution684 {
    public int[] findRedundantConnection(int[][] edges) {
        int[] union=new int[edges.length+1];//映射关系
        int[] r=new int[2];//返回结果
        for(int i=0;i<r.length;i++) r[i]=-1;
        for(int i=0;i<union.length;i++) union[i]=-1;

        for(int i=0;i<edges.length;i++){
            // 判断连通的顶点是否相同
            int y1=find(union,edges[i][0]);
            int y2=find(union,edges[i][1]);

            //冗余了，返回该边
            if(y1==y2) {
                r[0]=edges[i][0];
                r[1]=edges[i][1];
                return r;
            }
            union[y1]=y2;
        }
        return r;
    }

    /**
     * 在union中查找start能够到达的最终顶点
     *
     * @param union 数组保存的是顶点的连通关系
     * @param start 边的起始顶点
     * @return 最终顶点
     */
    public int find(int[] union,int start){
        if(union[start]==-1) return start;
        union[start]=find(union,union[start]);
        return union[start];
    }

    public static void main(String[] args) {
        int[][] edges = {
                {5, 1},
                {1, 4},
                {1, 2},
                {4, 3},
                {2, 3}
        };
        int[] r=new Solution684().findRedundantConnection(edges);
        ArrayUtils.printArray(r);
    }
}
