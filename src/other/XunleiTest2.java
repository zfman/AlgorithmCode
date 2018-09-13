package other;

import java.util.Scanner;

/**
 *
 * 水仙花数
 * 输入a和b为求解的范围
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class XunleiTest2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            String ret="";
            for(int i=a;i<=b;i++){
                int m=i%10;
                int n=i/10;
                int s=0;
                s+=Math.pow(m,3);
               while (n!=0){
                   m=n%10;
                   n=n/10;
                   s+=Math.pow(m,3);
               }
               if(s==i) ret+=s+" ";
            }

            if(ret.trim().equals("")) System.out.println("no");
            else System.out.println(ret.trim());
        }
    }
}
