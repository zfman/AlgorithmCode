package ali2019;


import java.util.Scanner;

/**
 * 阿里客户端模拟笔试
 *
 * 内存回收：相邻页面不能同时回收，求最大回收的内存
 * 输入：
 * 3
 * 1 2 3
 *
 * 输出：4
 * 回收1和3
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Main {
    public static int done(int[] m){
        int[] dp=new int[m.length];

        if(m.length==0) return 0;
        if(m.length==1) return m[0];
        if(m.length==2) return Math.max(m[0],m[1]);

        dp[0]=m[0];
        dp[1]=Math.max(m[0],m[1]);

        for(int i=2;i<dp.length;i++){
            if(m[i]+dp[i-2]>dp[i-1]) dp[i]=m[i]+dp[i-2];
            else{
                dp[i]=dp[i-1];
            }
        }
        return dp[m.length-1];
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] m=new int[n];
        for(int i=0;i<n;i++){
            m[i]=scanner.nextInt();
        }
        int r=done(m);
        System.out.println(r);
    }
}
