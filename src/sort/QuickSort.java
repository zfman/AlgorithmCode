package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 快速排序
 *
 * 快速排序通过一个切分元素将数组分为两个子数组，左子数组小于等于切分元素，
 * 右子数组大于等于切分元素，将这两个子数组排序也就将整个数组排序了。
 *
 * <h3>性能分析</h3>
 *
 * 快速排序是原地排序，不需要辅助数组，但是递归调用需要辅助栈。
 *
 * 快速排序最好的情况下是每次都正好能将数组对半分，这样递归调用次数才是最少的。
 * 这种情况下比较次数为 CN=2CN/2+N，复杂度为 O(NlogN)。
 *
 * 最坏的情况下，第一次从最小的元素切分，第二次从第二小的元素切分，如此这般。
 * 因此最坏的情况下需要比较 N2/2。为了防止数组最开始就是有序的，在进行快速排序时需要随机打乱数组。
 *
 * <h3>算法改进</h3>
 *
 * （一）切换到插入排序
 *
 * 因为快速排序在小数组中也会递归调用自己，对于小数组，插入排序比快速排序的性能更好，
 * 因此在小数组中可以切换到插入排序。
 *
 * （二）三数取中
 *
 * 最好的情况下是每次都能取数组的中位数作为切分元素，但是计算中位数的代价很高。
 * 人们发现取 3 个元素并将大小居中的元素作为切分元素的效果最好。
 *
 * （三）三向切分
 *
 * 对于有大量重复元素的数组，可以将数组切分为三部分，分别对应小于、等于和大于切分元素。
 *
 * 三向切分快速排序对于只有若干不同主键的随机数组可以在线性时间内完成排序。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class QuickSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        shuffle(nums);
        sort(nums,0,nums.length-1);
    }

    public void sort(T[] nums,int l,int h){
        if(l>=h) return;
        int j=partition(nums,l,h);
        sort(nums,l,j-1);
        sort(nums,j+1,h);
    }

    /**
     * 切分
     * @param nums
     * @param l
     * @param h
     * @return
     */
    public int partition(T[] nums,int l,int h){
        int i=l,j=h+1;
        T v=nums[l];
        while(true){
            while(i!=h&&less(nums[++i],v));
            while(j!=l&&less(v,nums[--j]));
            if(i>=j) break;
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }

    /**
     * 打乱顺序
     * @param nums
     */
    public void shuffle(T[] nums){
        List<Comparable> list=Arrays.asList(nums);
        Collections.shuffle(list);
        list.toArray(nums);
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new QuickSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
