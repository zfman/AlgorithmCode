package sort;

/**
 * 希尔排序
 *
 * 先将整个待排记录序列分割成若干子序列,分别进行直接插入排序，
 * 待整个序列中的记录“基本有序”时，再对全体记录进行一次直接插入排序
 *
 * 对于大规模的数组，插入排序很慢，因为它只能交换相邻的元素，每次只能将逆序数量减少 1。
 * 希尔排序的出现就是为了改进插入排序的这种局限性，它通过交换不相邻的元素，每次可以将逆序数量减少大于 1。
 * 希尔排序使用插入排序对间隔 h 的序列进行排序。通过不断减小 h，最后令 h=1，就可以使得整个数组是有序的。
 *
 *
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Shell<T extends Comparable<T>> extends Sort<T> {
    @Override
    public void sort(T[] nums) {
        int n=nums.length;
        int step=1;
        while (step<n/3) step=step*3+1;
        System.out.println(step);
        while(step>=1){
            for(int i=step;i<n;i++){
                for (int j=i;j>=step&&less(nums[j],nums[j-step]);j-=step){
                    swap(nums,j,j-step);
                }
            }
            step=step/3;
        }

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
