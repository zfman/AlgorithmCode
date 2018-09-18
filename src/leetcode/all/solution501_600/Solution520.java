package leetcode.all.solution501_600;

/**
 * 520. 检测大写字母
 *
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution520 {
    /**
     * 根据前两个字符判断所属的类别，由此决定后续字符应当具有的行为
     * 遍历后续字符，判断是否都具有所属类型的行为
     *
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;

        char ch1=word.charAt(0);
        char ch2=word.charAt(1);
        //1:全为大写 2：首字母大写或者全为小写
        int type=1;
        if(ch1>='A'&&ch1<='Z'){
            if(ch2>='A'&&ch2<='Z'){
                type=1;
            }else type=2;
        }else{
            if(ch2>='A'&&ch2<='Z'){
               return false;
            }else type=2;
        }

        //遍历后续字符
        for(int i=2;i<word.length();i++){
            char ch=word.charAt(i);
            if(type==1){//全为大写
                if(ch>='a'&&ch<='z') return false;
            }else if(type==2){//后续字符全为小写
                if(ch>='A'&&ch<='Z') return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String words="FlaG";
        boolean r=new Solution520().detectCapitalUse(words);
        System.out.println(r);
    }
}
