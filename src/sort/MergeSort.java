package sort;

/**
 * 归并排序的思想是将数组分成两部分，分别进行排序，然后归并起来。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public abstract class MergeSort<T extends Comparable<T>> extends Sort<T> {

    protected T[] tmp;

    protected void merge(T[] nums, int l, int m, int h) {
        //i:待归并的前者的位置,j:待归并的后者的位置
        int i = l, j = m + 1;
        for (int k = l; k <= h; k++) {
            tmp[k] = nums[k];
        }

        //两个子序列合并
        int v=l;
        while(i<=m&&j<=h){
            if(tmp[i].compareTo(tmp[j])<=0) nums[v++]=tmp[i++];
            else nums[v++]=tmp[j++];
        }
        if(m>i){
            for(;j<=h;j++) nums[v++]=tmp[j];
        }
        if(j>h){
            for(;i<=m;i++) nums[v++]=tmp[i];
        }
    }
}
