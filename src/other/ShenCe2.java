package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 神策数据
 * 输入两行，第一行为时钟，第二行是经过的时间，输入时钟显示的结果
 *
 * 输入：
 * 10:00:00
 * 00:11:12
 *
 * 输出：
 * 10:11:12
 *
 */
public class ShenCe2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String line1=scanner.nextLine();
        String line2=scanner.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat("HH:mm:ss");
        try {
            Date date1=sdf.parse("2018-09-21 "+line1);
            Date date2=sdf.parse("2018-09-21 "+line2);
            Date date3=sdf.parse("2018-09-21 00:00:00");
            Date date4=new Date(date1.getTime()+(date2.getTime()-date3.getTime()));
            String ret=sdf2.format(date4);
            System.out.println(ret);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
