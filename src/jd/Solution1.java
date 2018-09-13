package jd;

import java.util.*;

/**
 * 集合（京东2017秋招真题）
 *
 * 给你两个集合，要求 {A} + {B}。
 *
 * 注：同一个集合中不会有两个相同的元素。
 *
 * 输入
 * 多组（不超过 5 组）数据。
 * 每组输入数据分为三行，第一行有两个数字 n,m($0＜n,m\leq10000$)，分别表示集合 A 和集合 B 的元素个数。后两行分别表示集合 A 和集合 B。每个元素为不超出 int 范围的整数，每个元素之间有一个空格隔开。
 *
 *
 * 样例输入
 * 1 2
 * 1
 * 2 3
 * 1 2
 * 1
 * 1 2
 *
 *
 * 输出
 * 针对每组数据输出一行数据，表示合并后的集合，要求从小到大输出，每个元素之间有一个空格隔开。
 *
 * 样例输出
 * 1 2 3
 * 1 2
 *
 * 时间限制
 * C/C++语言：1000MS其它语言：3000MS
 * 内存限制
 * C/C++语言：65536KB其它语言：589824KB
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int aN=scanner.nextInt();
            int bN=scanner.nextInt();
            int[] a=new int[aN];
            int[] b=new int[bN];
            int[] c=new int[aN+bN];
            int i=0,j=0,k=0;

            //输入
            for(int m=0;m<aN;m++){
                a[m]=scanner.nextInt();
            }
            for(int m=0;m<bN;m++){
                b[m]=scanner.nextInt();
            }

            int reduce=0;//有几个重复的

            //合并
            while (i<a.length&&j<b.length){
                if(a[i]<b[j]) c[k++]=a[i++];
                //注意重复时的处理
                else if(a[i]==b[j]){
                    c[k++]=a[i++];
                    reduce++;
                    j++;
                }
                else c[k++]=b[j++];
            }
            while (i<a.length){
                c[k++]=a[i++];
            }
            while (j<b.length){
                c[k++]=b[j++];
            }

            //输出
            for(int m=0;m<c.length-reduce;m++) {
                System.out.print(c[m]+" ");
            }
            System.out.println();
        }
    }
}