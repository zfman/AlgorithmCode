package sort;

/**
 * 由于堆可以很容易得到最大的元素并删除它，不断地进行这种操作可以得到一个递减序列。
 * 如果把最大元素和当前堆中数组的最后一个元素交换位置，并且不删除它，
 * 那么就可以得到一个从尾到头的递减序列，从正向来看就是一个递增序列。
 * 因此很容易使用堆来进行排序。并且堆排序是原地排序，不占用额外空间。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class HeapSort<T extends Comparable<T>> extends Sort<T>{
    @Override
    public void sort(T[] nums) {
        int n=nums.length-1;
        for(int k=n/2;k>=1;k--){
            sink(nums,k,n);
        }
        while(n>1){
            swap(nums,1,n--);
            sink(nums,1,n);
        }
    }

    public void sink(T[] nums,int k,int n){
        while(2*k<=n){
            int j=2*k;
            if(j<n&&less(nums,j,j+1)) j++;
            if(!less(nums,k,j)) break;
            swap(nums,k,j);
            k=j;
        }
    }

    public boolean less(T[] nums,int i,int j){
        return nums[i].compareTo(nums[j])<0;
    }

    public static void main(String[] args){
        //第一位不参与排序
        //排序：5,1,8,7,10,6,9,5,20,3,0
        Integer[] arr={
                999,5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new HeapSort<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr,1);
    }
}
