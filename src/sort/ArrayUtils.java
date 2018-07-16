package sort;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ArrayUtils {
    public static <T> void printArray(T[] a){
        if(a==null) return;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static <T> void printArray(T[] a,int start){
        if(a==null) return;
        for(int i=start;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
