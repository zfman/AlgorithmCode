package utils;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ArrayUtils {
    public static void printArray(int[] a){
        if(a==null) return;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] a){
        if(a==null) return;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]?"1 ":"0 ");
        }
        System.out.println();
    }

    public static void printArray(int[] a,int start){
        if(a==null) return;
        for(int i=start;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
