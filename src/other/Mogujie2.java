package other;

import utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 蘑菇街 - 分词（未完成）
 *
 * 第一行是一个字符串，第二行是字典逗号分隔每一个词，
 * 输出分词结果，有多种分词结果使用逗号分隔
 *
 * input:
 * catsanddog
 * cat,cats,and,sand,dog
 *
 * output:
 * [cats and dog,cat sand dog]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Mogujie2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String ling1=scanner.nextLine();
        String line2=scanner.nextLine();
        String[] arr=line2.substring(7,line2.length()-1).split(",");
        List<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        //catsanddog
        //cat cats,and,sand,dog
        //output: [cats and dog,cat sand dog]
        System.out.println(arr[1]);
    }
}
