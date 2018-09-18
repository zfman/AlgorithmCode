package leetcode.all.solution501_600;

/**
 * 557. 反转字符串中的单词 III
 *
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=todo(arr[i])+" ";
        }
        return str.trim();
    }

    public String todo(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String r = new Solution557().reverseWords(s);
        System.out.println(r);
    }
}
