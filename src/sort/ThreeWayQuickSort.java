package sort;

/**
 * 三向切分快速排序
 * 对于有大量重复元素的数组，可以将数组切分为三部分，分别对应小于、等于和大于切分元素。
 *
 * 三向切分快速排序对于只有若干不同主键的随机数组可以在线性时间内完成排序。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ThreeWayQuickSort<T extends Comparable<T>> extends QuickSort<T> {
    @Override
    public void sort(T[] nums, int l, int h) {
        if(l>=h) return;
        int lt=l,i=l+1,gt=h;
        T v=nums[l];
        System.out.println(v);
        while (i<=gt){
            int compare=nums[i].compareTo(v);
            if(compare<0){
                swap(nums,lt++,i++);
            }else if(compare>0){
                swap(nums,i,gt--);
            }else {
                i++;
            }
        }
        sort(nums,l,lt-1);
        sort(nums,gt+1,h);
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,1,3,3,3,3,5,5,8,8,8
        };
        ArrayUtils.printArray(arr);
        Sort<Integer> sort=new ThreeWayQuickSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
