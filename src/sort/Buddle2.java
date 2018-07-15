package sort;

/**
 * 冒泡排序的改进
 *
 * 通过从左到右不断交换相邻逆序的相邻元素，
 * 在一轮的交换之后，可以让未排序的元素上浮到右侧。
 *
 * 在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Buddle2<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n=nums.length;
        boolean hasSort=false;
        for(int i=0;i<n&&!hasSort;i++){
            hasSort=true;
            for(int j=0;j<n-i-1;j++){
                if(less(nums[j+1],nums[j])) {
                    hasSort=false;
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new Buddle2<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
