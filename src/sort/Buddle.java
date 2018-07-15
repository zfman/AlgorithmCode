package sort;

/**
 * 冒泡排序
 *
 * 通过从左到右不断交换相邻逆序的相邻元素，
 * 在一轮的交换之后，可以让未排序的元素上浮到右侧。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Buddle<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(less(nums[j+1],nums[j])) {
                    swap(nums,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args){
        Integer[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        Sort<Integer> sort=new Buddle<>();
        sort.sort(arr);
        ArrayUtils.printArray(arr);
    }
}
