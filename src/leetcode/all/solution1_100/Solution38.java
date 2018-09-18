package leetcode.all.solution1_100;

/**
 * 38.报数.
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 * 示例 1:
 * 输入: 1
 * 输出: "1"
 *
 * 示例 2:
 * 输入: 4
 * 输出: "1211"
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution38 {

    /**
     * 这道题重要的是要理解题意，题目有点难懂
     * 第一个序列为1，之后的序列都是由前一个递推出来的
     * 递推规则如下:
     * 假设上一个序列为AABCDD,那么该序列为2A1B1B2D
     * 统计序列中连续的字符的个数以及字符，拼接起来
     * AA就是2A，B就是1B，C就是1C，DD就是2D
     *
     * 接下来只要根据式子递推就可以了
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        int i=1;
        String now="1";
        while(i<n){
            now=next(now);
            i++;
        }
        return now;
    }

    /**
     * 推导v的下一个序列
     * @param v
     * @return
     */
    public String next(String v) {
        if(v==null||v.length()==0) return null;

        String r="";//序列
        char pre=v.charAt(0);//重复的字符
        int c=1;//重复个数

        for(int i=1;i<v.length();i++){
            char ch=v.charAt(i);
            if(ch==pre){
                c++;
            }else{
                r+=c+""+(pre-'0');
                pre=ch;
                c=1;
            }
        }
        r+=c+""+(pre-'0');
        return r;
    }

    public static void main(String[] args) {
        int n = 5;
        String r = new Solution38().countAndSay(n);
        System.out.println(r);
    }
}
