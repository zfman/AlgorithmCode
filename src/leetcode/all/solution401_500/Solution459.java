package leetcode.all.solution401_500;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=0;i<s.length()/2;i++){
            if(i!=(s.length()/2-1)&&s.charAt(i+1)!=s.charAt(0)) continue;
            String subStr=s.substring(0,i+1);
            String tmp=s.replaceAll(subStr,"");
            if(tmp.equals("")) return true;
        }
        return false;
    }

    public static void main(String[] args){
        String s="ababc";
        boolean r=new Solution459().repeatedSubstringPattern(s);
        System.out.println(r);
    }
}
