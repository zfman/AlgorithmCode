package other;

import java.util.Scanner;

/**
 * 把陀峰命名改为下划线命名
 * 输入：
 * SensorsData
 *
 * 输出：
 * sensors_data
 */
public class ShenCe1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String ret="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A'&&ch<='Z')){
                char tmp=(char)((int)ch+32);
                if(i==0){
                    ret+=tmp;
                }else{
                    ret+="_"+tmp;
                }
            }else{
                ret+=ch;
            }
        }
        System.out.println(ret);
    }
}
