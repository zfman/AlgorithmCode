package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 时间相关
 * 给定两个时间，计算时针、分针、秒针走过的角度
 */
public class Baicizhan1 {
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Scanner scanner=new Scanner(System.in);
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();

            Date date1=sdf.parse("2018-09-20 "+str1);
            Date date2=sdf.parse("2018-09-20 "+str2);

            long d=date2.getTime()-date1.getTime();

            double hv=d/120000;
            double mv=d/10000;
            double mmv=d/1000*6;
            System.out.println((int)hv);
            System.out.println((int)mv);
            System.out.println((int)mmv);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
