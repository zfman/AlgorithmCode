package other;

import java.util.Scanner;

/**
 * 日志输出，第一行是线程名，筛选出该线程的日志记录，每条日志可能占多行
 * Thread-1
 * 2018-01-03 22:00:00  Thread-1    dd{
 *     dd:eee
 * }
 * 2018-01-03 22:00:00  Thread-2    iiiuyyyy
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ShenCe {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();//线程名
        boolean is=false;//上条日志是否可以被输出

        while (scanner.hasNextLine()){
            String content=scanner.nextLine();
            String[] arr=content.split("\\t");
            if(arr.length==1) name=arr[0];
            if(arr[0].matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")){
                if(arr.length>1&&arr[1].equals(name)){
                    is=true;
                    System.out.println(content);
                }else is=false;
            }else{
                if(is) System.out.println(content);
            }
        }
    }
}


