package sort;

/**
 * 自顶向下归并排序
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class UpToDownMergeSort<T extends Comparable<T>> extends MergeSort<T> {

    /**
     * 因为每次都将问题对半分成两个子问题，
     * 而这种对半分的算法复杂度一般为 O(NlogN)，
     * 因此该归并排序方法的时间复杂度也为 O(NlogN)。
     *
     * @param nums
     */
    @Override
    public void sort(T[] nums) {
        tmp= (T[]) new Comparable[nums.length];
        sort(nums,0,nums.length-1);
    }

    public void sort(T[] nums,int l,int h) {
        if(l>=h) return;
        int mid=l+(h-l)/2;
        sort(nums,l,mid);
        sort(nums,mid+1,h);
        merge(nums,l,mid,h);
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new UpToDownMergeSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
