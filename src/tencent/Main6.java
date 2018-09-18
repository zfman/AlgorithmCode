package tencent;

import java.util.Scanner;

/**
 * 求解一个数是否是和谐数：n的各个位之和能够被n整除，那么这个数是和谐数
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Main6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int t=scanner.nextInt();
            int v=t;
            //分解并求和
            int sum=0;
            while(v!=0){
                sum+=v%10;
                v=v/10;
            }
            if(t%sum==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
