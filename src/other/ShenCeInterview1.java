package other;

/**
 * 神策数据 面试手写算法题1 - 折半查找的实现
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ShenCeInterview1 {
    public int find(int[] arr,int l,int r,int val){
        if(l>r) return -1;
        int middle=(l+r)/2;
        if(val>arr[middle]) return find(arr,middle+1,r,val);
        else if(val<arr[middle]) return find(arr,l,middle-1,val);
        else{
            return middle;
        }
    }

    public static void main(String[] args){
        int[] a={
                1,3,5,9,10,20,33
        };
        int index=new ShenCeInterview1().find(a,0,a.length,33);
        System.out.println(index);
    }
}
