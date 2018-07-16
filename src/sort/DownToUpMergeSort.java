package sort;

/**
 * 自底向上归并排序
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class DownToUpMergeSort<T extends Comparable<T>> extends MergeSort<T> {

    /**
     * 先归并那些微型数组，然后成对归并得到的微型数组。
     *
     * @param nums
     */
    @Override
    public void sort(T[] nums) {
        int n = nums.length;
        tmp = (T[]) new Comparable[n];
        for (int i = 1; i < n; i += i)
            for (int j = 0; j < n - i; j += i + i)
                merge(nums, j, j + i - 1, Math.min(j + i + i - 1, n - 1));
    }

    public static void main(String[] args) {
        Integer[] arr = {
                5, 1, 8, 7, 10, 6, 9, 5, 20, 3, 0
        };
        Sort<Integer> sort = new DownToUpMergeSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
