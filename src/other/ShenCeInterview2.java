package other;

/**
 * 神策数据 面试手写算法题2-统计数字个数
 *
 * 有数据：[1，2，3，4，3，2，1，4，5，6] 统计每个数字出现的个数，并输出每个数字出现的个数，格式如下：
 * 1,2
 * 2,2
 * 3,2
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ShenCeInterview2 {
    public void todo(int[] arr){
        //get max of array
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }

        // 下标保存数字
        // 元素值保存的是次数
        // java int[] 元素默认为0
        int[] b=new int[max+1];
        for(int i=0;i<arr.length;i++){
            b[arr[i]]++;
        }

        for(int i=0;i<b.length;i++){
            if(b[i]!=0){
                System.out.println(i+","+b[i]);
            }
        }
    }

    public static void main(String[] args){
        int[] a={
                1,2,3,4,3,2,1,4,5,6
        };
        new ShenCeInterview2().todo(a);
    }

}
