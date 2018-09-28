package other;

import java.util.Scanner;

/**
 * 百度2019 笔试-地外文明
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 地球上的宇宙科学家发现，在宇宙中的K29388G10位置有一颗酷似地球的星球，上面有一种文明，但是并不知道其文明程度。所以为了试探该星球文明是高度发达还是非常古老落后，科学家们决定发送一段英文变体，来测试它们是否能够快速识别、掌握这种文字并对地球做出反馈。
 *
 * 科学家们制定了英文字母移位变换规则：有英文大写字母表ABCDEFGHIJKLMNOPQRSTUVWXYZ，定义Z的下一个字母为A，A的上一个字母为Z（变成一个环）。令A=0，B=1，C=2，……，Z=25，每个字母对应一个数字，对于奇数字母，将其变换成它前面的第6个字母，对于偶数字母，将其变换成它后面的第8个字母。例如对于Y=24，它是偶数字母，将其变换成它后面的第八个字母（…XYZABCDEFGH…），也就是G。
 *
 * 现在，给你一段仅由大写字母组成的文字，请你按以上规则对其做一次变换。
 *
 * 输入
 * 仅一行，表示一段文字。（长度不超过100）
 *
 * 输出
 * 仅一行，表示变换后的文字。
 *
 *
 * 样例输入
 * ABCDEFGHUVWXYZ
 * 样例输出
 * IVKXMZOBCPERGT
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Baidu1 {
    public static String todo(String s){
        String ret="";
        for(char ch:s.toCharArray()){
            ret+=""+getChar(s,(int)ch-65);
        }
        return ret;
    }

    public static char getChar(String s,int val){
        int charIndex=0;
        if(val%2!=0) charIndex=val-6;
        else charIndex=val+8;
        if(charIndex<0){
            charIndex+=26;
        }
        if(charIndex>25){
            charIndex-=26;
        }
        return (char) (charIndex+65);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(todo(str));
    }
}
