package leetcode.all.solution501_600;

/**
 * 551. 学生出勤纪录 I
 *
 * 给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
 *
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 *
 * 你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 *
 * 示例 1:
 *
 * 输入: "PPALLP"
 * 输出: True
 * 示例 2:
 *
 * 输入: "PPALLL"
 * 输出: False
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution551 {

    public boolean checkRecord(String s) {
        int aCount=0;//char A count
        int sameCount=0; //same char count

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A') aCount++;
            if(ch=='L') sameCount++;
            else sameCount=0;
            if(sameCount>2) break;
        }
        return aCount<=1&&sameCount<=2;
    }

    public static void main(String[] args) {
        String s = "PPALLP";
        boolean r = new Solution551().checkRecord(s);
        System.out.println(r);
    }
}
