package leetcode.all.solution351_400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 383. 赎金信
 *
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 *
 * 注意：
 *
 * 你可以假设两个字符串均只含有小写字母。
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[26];
        for(char ch:magazine.toCharArray()){
            a[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            a[ch-'a']--;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]<0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        boolean r=new Solution383().canConstruct("aa","ab");
        System.out.println(r);
    }
}
