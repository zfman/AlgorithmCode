package sort2;
import utils.ArrayUtils;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class QuickSort {
    public void sort(int[] nums){
        sort(nums,0,nums.length-1);
    }
    public void sort(int[] nums,int l,int r){
        if(l>=r) return;
        int j=partition(nums,l,r);
        sort(nums,l,j-1);
        sort(nums,j+1,r);
    }

    public int partition(int[] nums,int l,int r){
        int i=l;
        int j=r+1;
        int val=nums[l];
        while(true){
            while(j!=l&&nums[--j]>val);
            while(i!=r&&nums[++i]<val);
            if(i>=j) break;
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }

    public void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args){
        int[] arr={
                5,1,8,7,10,6,9,5,20,3,0
        };
        new QuickSort().sort(arr);
        ArrayUtils.printArray(arr);
    }
}
