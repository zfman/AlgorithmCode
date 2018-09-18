package other;

import leetcode.common.AMGraph;
import leetcode.common.GraphUtils;
import utils.ArrayUtils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class GraphTest {
    public static void main(String[] args) {
        AMGraph graph=GraphUtils.cin();
        boolean[] visited=new boolean[graph.vexNum+1];
//        dfs(graph,1,visited);
//        GraphUtils.print(graph);

        Queue<Integer> queue=new LinkedList<>();
        bfs(graph,5,visited,queue);
    }

    /**
     * 连通图的深度优先遍历，对于非连通图，
     * 应该依次将顶点作为遍历的起始点
     *
     * @param graph 图
     * @param v 访问的顶点
     * @param visited 访问标志数组
     */
    public static void dfs(AMGraph graph, int v, boolean[] visited){
        System.out.println("visited::"+v);
        visited[v]=true;
        for(int i=1;i<=graph.vexNum;i++){
            if(graph.arcs[v][i]!=0&&!visited[i]) dfs(graph,i,visited);
        }
    }

    /**
     * 图的广度优先遍历
     *
     * @param graph 图
     * @param v 起始顶点
     * @param visited 访问标志数组
     * @param queue 队列
     */
    public static void bfs(AMGraph graph, int v, boolean[] visited,Queue<Integer> queue){
        if(!visited[v]){
            visited[v]=true;
            System.out.println("visited::"+v);
            queue.offer(v);
        }
        while (!queue.isEmpty()){
            Integer pop=queue.poll();
            if(!visited[pop]){
                visited[pop]=true;
                System.out.println("visited::"+pop);
            }
            for(int i=1;i<=graph.vexNum;i++){
                if(graph.arcs[pop][i]!=0&&!visited[i]){
                    queue.offer(i);
                }
            }
        }
    }
}
