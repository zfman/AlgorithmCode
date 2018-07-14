package leetcode.all.solution150;

/**
 * 125. 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution125 {

    /**
     * 从前往后，从后往前逐位比较
     * 注意：要过滤掉非字符、非数字的符号
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i <= j) {
            while(i<s.length()&&!isCharAndNumber(s.charAt(i))) i++;
            while(j>=0&&!isCharAndNumber(s.charAt(j))) j--;
            if(i>s.length()||j<0) break;
            if(!isSame(s.charAt(i),s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * 判断是否相等，忽略大小写
     * @param ch1
     * @param ch2
     * @return
     */
    public boolean isSame(char ch1,char ch2){
        return (ch1+"").toLowerCase().equals((ch2+"").toLowerCase());
    }

    /**
     * 判断是否为合法字符
     * @param ch
     * @return
     */
    public boolean isCharAndNumber(char ch){
        if(ch>='A'&&ch<='Z') return true;
        if(ch>='a'&&ch<='z') return true;
        if(ch>='0'&&ch<='9') return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "0P";
        boolean r = new Solution125().isPalindrome(s);
        System.out.println(r);//false
    }
}
