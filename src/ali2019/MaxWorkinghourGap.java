package ali2019;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
import java.util.*;

/**
 * 阿里2018秋招客户端开发工程师编程测试
 *
 * 这次的题目确实相当简单,题目是关于工时预估的，
 * 我这里将题目简化一下：
 *
 * 给定一个数组，如果数组只有一个元素，返回0
 * 对数组排序，然后计算相邻的差的最大值
 */
public class MaxWorkinghourGap {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int maxWorkinghourGap(int[] workinghours) {
        if(workinghours.length<=1) return 0;
        Arrays.sort(workinghours);
        int max=0,tmp=0;
        for(int i=1;i<workinghours.length;i++){
            tmp=workinghours[i]-workinghours[i-1];
            if(tmp>max) max=tmp;
        }
        return max;
    }

    public static void main(String[] args){
        int[] a={
                1,3,15,10,9
        };
        //output:6
        int r=maxWorkinghourGap(a);
        System.out.println(r);
    }
}
