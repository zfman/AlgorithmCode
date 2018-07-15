package sort;

/**
 * 希尔排序
 *
 * 先将整个待排记录序列分割成若干子序列,分别进行直接插入排序，
 * 待整个序列中的记录“基本有序”时，再对全体记录进行一次直接插入排序
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Shell<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {

    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new Shell<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }

}
