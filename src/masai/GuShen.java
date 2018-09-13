package masai;

import java.util.Scanner;

/**
 * 有股神吗？
 *
 * 有，小赛就是！
 *
 * 经过严密的计算，小赛买了一支股票，他知道从他买股票的那天开始，股票会有以下变化：第一天不变，以后涨一天，跌一天，涨两天，跌一天，涨三天，跌一天...依此类推。
 *
 * 为方便计算，假设每次涨和跌皆为1，股票初始单价也为1，请计算买股票的第n天每股股票值多少钱？
 *
 *
 *
 * 输入
 * 输入包括多组数据；
 *
 * 每行输入一个n，1<=n<=10^9 。
 *
 * 样例输入
 * 1
 *
 * 2
 *
 * 3
 *
 * 4
 *
 * 5
 *
 * 输出
 * 请输出他每股股票多少钱，对于每组数据，输出一行。
 *
 * 样例输出
 * 1
 *
 * 2
 *
 * 1
 *
 * 2
 *
 * 3
 *
 * 时间限制
 * C/C++语言：1000MS其它语言：3000MS
 * 内存限制
 * C/C++语言：65536KB其它语言：589824KB
 *
 *
 */
public class GuShen {

    public static int doThing(int n){
        int i=0,k=2,j=2;
        while(k<n){
            i=i+2;
            j++;
            k=j+k;
            System.out.println(j+","+k);
        }
        return n-i;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n=scanner.nextInt();
            int r=doThing(n);
            System.out.println(r);
        }
    }
}
