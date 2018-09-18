package leetcode.common;

import java.util.Scanner;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class GraphUtils {

    /**
     * 无向图输入
     */
    public static AMGraph cin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("顶点数 边数：");
        int vexNum = scanner.nextInt();
        int arcNum = scanner.nextInt();

        int[] vexs = new int[vexNum + 1];
        int[][] arcs = new int[vexNum + 1][vexNum + 1];
        for (int i = 1; i <= vexNum; i++) {
            vexs[i] = i;
        }

        System.out.println("顶点1 顶点2（表示1-2有一条边）：");
        for (int i = 1; i <= arcNum; i++) {
            int pos1 = scanner.nextInt();
            int pos2 = scanner.nextInt();
            arcs[pos1][pos2] = 1;
            arcs[pos2][pos1] = 1;
        }

        AMGraph graph=new AMGraph();
        graph.arcs=arcs;
        graph.vexNum=vexNum;
        graph.arcNum=arcNum;

        return graph;
    }

    /**
     * 输出
     * @param graph
     */
    public static void print(AMGraph graph){
        if(graph.arcs==null) return;
        int[][] arcs=graph.arcs;
        for (int i = 1; i < arcs.length; i++) {
            for (int j = 1; j < arcs[i].length; j++)
                System.out.print(arcs[i][j] + " ");
            System.out.println();
        }
    }
}
