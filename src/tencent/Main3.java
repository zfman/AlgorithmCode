package tencent;

import java.util.*;

/**
 * 贪吃的小Q
 *
 * 小Q的父母要出差N天，走之前给小Q留下了M块巧克力。小Q决定每天吃的巧克力数量不少于前一天吃的一半，但是他又不想在父母回来之前的某一天没有巧克力吃，请问他第一天最多能吃多少块巧克力
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，表示父母出差的天数N(N<=50000)和巧克力的数量M(N<=M<=100000)。
 *
 *
 * 输出描述:
 * 输出一个数表示小Q第一天最多能吃多少块巧克力。
 *
 * 输入例子1:
 * 3 7
 *
 * 输出例子1:
 * 4
 */
public class Main3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//天数
        int m=in.nextInt();//块数
        for(int i=m;i>=1;i--){
            int other=m-i;//剩余块数
            int a=i;//当日吃的块数
            int j=n-1;//剩余天数
            for(;j>=1;j--){
                //能够满足的话就不需要继续遍历了
                if(a==1&&other>=j) {
                    j=-1;
                    break;
                }
                //不满足的话直接停止本轮遍历
                if(a==1&&other<j) break;

                a=(int)Math.ceil(a/2.0);
                other-=a;
                if(a==0||other<0) break;
            }
            if(j<1) {
                System.out.println(i);
                break;
            }
        }
    }
}
