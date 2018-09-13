package other;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 【Android开发工程师】最长无重复字符子串长度
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 给定一个字符串，找出不含有重复字符的最长子串的长度,
 *
 * 例：给定"abcabcbb"，无重复字符的最长子串是 "abc"，其长度为 3
 *
 * 输入
 * 一个字符串
 *
 * 输出
 * 最长无重复字符子串的长度
 *
 *
 * 样例输入
 * abcabcbb
 * 样例输出
 * 3
 */
public class Xunlei2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int lengthOfSubstring(String s) {
        int max=0;
        if(s==null) return 0;
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            list.clear();
            list.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!list.contains(s.charAt(j))){
                    list.add(s.charAt(j));
                }else{
                    if(list.size()>max) max=list.size();
                    list.clear();
                    break;
                }
            }
            if(list.size()>max) max=list.size();
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = lengthOfSubstring(_s);
        System.out.println(String.valueOf(res));

    }
}

