package other;

import java.util.Scanner;

/**
 * 求数列的和
 *
 * （编程题须知）（参考答案）
 *
 * 时间限制：C/C++语言 2000MS；其他语言 4000MS
 * 内存限制：C/C++语言 32768KB；其他语言 557056KB
 * 题目描述：
 * 数列的定义如下： 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 *
 * 输入
 * 输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，n和m的含义如前所述。
 *
 * 输出
 * 对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
 *
 *
 * 样例输入
 * 81 4
 * 2 2
 *
 * 样例输出
 * 94.73
 * 3.41
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class XunleiTest1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int first=scanner.nextInt();
            int c=scanner.nextInt();
            double p=first;
            double s=p;
            for(int i=1;i<c;i++){
                p=Math.sqrt(p);
                s+=p;
            }
            System.out.println(String.format("%.2f",s));
        }
    }
}
