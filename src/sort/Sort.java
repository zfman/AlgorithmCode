package sort;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public abstract class Sort<T extends Comparable<T>> {
    public abstract void sort(T[] nums);

    public boolean less(T v,T w){
        return v.compareTo(w)<0;
    }

    public void swap(T[] a,int i,int j){
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
