package sort;

/**
 * 归并方法将数组中两个已经排序的部分归并成一个。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class MergeSort<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {

    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new MergeSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
