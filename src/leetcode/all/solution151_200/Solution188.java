package leetcode.all.solution151_200;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution188 {

    /**
     * 第一行、二行单独处理
     * 其他行：
     * 1.第0列、第n-1列为1
     * 2.v[n][t]=v[n-1][t]+v[n-1][t+1]
     * (n:行,从0开始;t:第n行的第二个元素t=0，第三个为t=1)
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        int i=3;
        List<List<Integer>> r=new ArrayList<>();
        if (numRows<=0) return r;

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        r.add(list1);
        if(numRows==1) return r;

        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(1);
        r.add(list2);
        if(numRows==2) return r;

        List<Integer> pre=list2;

        while (i<=numRows){
            List<Integer> list=new ArrayList<>();
            r.add(list);
            list.add(1);
            int t=0;
            while(t<i-2){
                list.add(pre.get(t)+pre.get(t+1));
                t++;
            }
            list.add(1);
            pre=list;
            i++;
        }
        return r;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> r = new Solution188().generate(numRows);
        System.out.println(r);
    }
}
