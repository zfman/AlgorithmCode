package other;


import java.util.Scanner;

/**
 * 蘑菇街-网格路径数（未完成）
 * 给定网格x*y，求解从左上角到右下角的路径数，每次只能向右或向下移动一格
 *
 * input:
 * 3 2
 *
 * output:
 * 10
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Mogujie1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        int X=x+y-2;
        int r=x-1;
        double ret=1.0;
        for(int i=1;i<=x-1;i++){
            ret=ret*(X-r+i)/i;
        }
        System.out.println((int)ret);

    }
}
