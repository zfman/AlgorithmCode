package leetcode.all.solution1_100;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数.
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 * 输入: "III"
 * 输出: 3
 *
 * 示例 2:
 * 输入: "IV"
 * 输出: 4
 *
 * 示例 3:
 * 输入: "IX"
 * 输出: 9
 *
 * 示例 4:
 * 输入: "LVIII"
 * 输出: 58
 * 解释: C = 100, L = 50, XXX = 30, III = 3.
 *
 * 示例 5:
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution13 {

    /**
     * 遍历字符串，如果该字符的值小于等于上一个字符的值,直接
     * 加上当前字符表示的值即可;反之,将上一个字符表示的值减去,
     * 加上当前字符表示的值与上一个字符表示的值的差
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        Map<Character,Integer> map=initMap();
        if(s==null||s.length()==0) return 0;

        int value=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0) value+=map.get(ch);
            else{
                char pre=s.charAt(i-1);
                if(map.get(ch)<=map.get(pre)){
                    value+=map.get(ch);
                }else{
                    value-=map.get(pre);
                    value+=(map.get(ch)-map.get(pre));
                }
            }
        }
        return value;
    }

    /**
     * 初始化映射关系
     * @return
     */
    public Map<Character,Integer> initMap() {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return map;
    }

    public static void main(String[] args){
        String s="MCMXCIV";
        int r=new Solution13().romanToInt(s);
        System.out.println(r);//1994
    }
}
