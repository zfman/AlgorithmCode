package sort;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Heap<T extends Comparable<T>> {

    private T[] heap;
    private int n=0;

    public Heap(int maxNum){
        n=maxNum;
    }

    public boolean isEmpty(){
        return n==0;
    }

    protected boolean less(int i,int j){
        return heap[i].compareTo(heap[j])<0;
    }

    protected void swap(int i,int j){
        T t=heap[i];
        heap[i]=heap[j];
        heap[j]=t;
    }

    /**
     * 上浮
     * @param k
     */
    protected void swim(int k){
        while (k>1&&less(k/2,k)){
            swap(k/2,k);
            k=k/2;
        }
    }

    /**
     * 下沉
     * @param k
     */
    protected void sink(int k){
        while (2*k<=n){
            int j=2*k;
            if(j<n&&less(j,j+1)) j++;
            if(!less(k,j)) break;;
            swap(k,j);
            k=j;
        }
    }

    protected void insert(T v){
        heap[++n]=v;
        swim(n);
    }

    public T deleteMax(){
        T max=heap[1];
        swap(1,n--);
        heap[n+1]=null;
        sink(1);
        return max;
    }
}
