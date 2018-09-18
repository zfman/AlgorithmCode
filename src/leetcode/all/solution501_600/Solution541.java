package leetcode.all.solution501_600;

/**
 * 541. 反转字符串 II
 *
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 *
 * 示例:
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 要求:
 *
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution541 {
    public String reverseStr(String s, int k) {
        if(s==null||s.equals("")) return "";
        if(s.length()<k) return todo(s);
        else if(s.length()<2*k) return todo(s.substring(0,k))+s.substring(k);
        else {
            //前2k个
            String str=s.substring(0,2*k);
            return todo(str.substring(0,k))+str.substring(k)+reverseStr(s.substring(2*k),k);
        }
    }

    public String todo(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String r = new Solution541().reverseStr(s, k);
        System.out.println(r);
    }
}
