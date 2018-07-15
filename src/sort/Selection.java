package sort;

/**
 * 选择排序
 *
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
 * 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
 * 不断进行这样的操作，直到将整个数组排序。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Selection<T extends Comparable<T>> extends Sort<T>{
    @Override
    public void sort(T[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(less(nums[j],nums[i])) min=j;
            }
            swap(nums,i,min);
        }
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new Selection<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
