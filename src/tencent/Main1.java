package tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 腾讯2018秋招模拟笔试
 *
 * 有一组数字，两个人A和B依次从其中取出一个数字，每次都取出剩余数字中最大的一个，
 * A先B后，计算A取出的数字之和-B取出的数字之和
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Main1 {

    /**
     * 先排序，再依次求得A、B各自的分数
     *
     * @param a
     * @return
     */
    public static int done(int[] a){
        int n=a.length;
        if(n==0) return 0;
        Arrays.sort(a);
        int v1=0,v2=0;
        int index=0;
        for(int i=n-1;i>=0;i--){
            if(index%2==0) v1+=a[i];
            else v2+=a[i];
            index++;
        }
        return v1-v2;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int r=done(a);
        System.out.println(r);
    }
}
