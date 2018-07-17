package offer;

import utils.ArrayUtils;

/**
 * 调整数组顺序使奇数位于偶数前面
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ReOrderArraySolution {
    public void reOrderArray(int [] array) {
        int n=array.length;
        int k=0;//已排好的奇数位置
        for(int i=0;i<n;i++){
            if(array[i]%2==1){
                int j=i;
                while (j>k){
                    int tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                    j--;
                }
                k++;
            }
        }
    }

    public static void main(String[] args){
        //output:1,3,5,7,2,4,6
        int[] array={
                1,2,3,4,5,6,7
        };
        new ReOrderArraySolution().reOrderArray(array);
        ArrayUtils.printArray(array);
    }
}
