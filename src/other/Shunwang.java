package other;

import java.util.HashSet;
import java.util.Set;

/**
 * 顺网科技-去除数组中重复元素
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Shunwang {
    public static void main(String[] args){
        int[] arr={
                1,2,3,4,10,8,5,1,2
        };
        Set<Integer> set=new HashSet<>();
        for(Integer val:arr){
            set.add(val);
        }
        int[] newArr=new int[set.size()];
        int i=0;
        for(Integer val:set){
            newArr[i++]=val;
        }
        for(int t=0;t<newArr.length;t++){
            System.out.print(newArr[t]+" ");
        }
    }
}
