package sort;

/**
 * 插入排序
 *
 * 插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，
 * 使得插入之后左部数组依然有序。
 * 第 j 元素是通过不断向左比较并交换来实现插入过程：
 * 当第 j 元素小于第 j - 1 元素，就将它们的位置交换，
 * 然后令 j 指针向左移动一个位置，不断进行以上操作。
 *
 * 插入排序的复杂度取决于数组的初始顺序，如果数组已经部分有序了，逆序较少，那么插入排序会很快。
 *
 * 平均情况下插入排序需要 ~N2/4 比较以及 ~N2/4 次交换；
 * 最坏的情况下需要 ~N2/2 比较以及 ~N2/2 次交换，最坏的情况是数组是倒序的；
 * 最好的情况下需要 N-1 次比较和 0 次交换，最好的情况就是数组已经有序了。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Insertion<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0&&less(nums[j],nums[j-1]);j--){
                swap(nums,j,j-1);
            }
        }
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new Insertion<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
