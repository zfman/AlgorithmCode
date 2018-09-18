package leetcode.all.solution401_500;

/**
 * 443. 压缩字符串
 *
 * 给定一组字符，使用原地算法将其压缩。
 *
 * 压缩后的长度必须始终小于或等于原数组长度。
 *
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 *
 * 在完成原地修改输入数组后，返回数组的新长度。
 *
 *
 *
 * 进阶：
 * 你能否仅使用O(1) 空间解决问题？
 *
 *
 *
 * 示例 1：
 *
 * 输入：
 * ["a","a","b","b","c","c","c"]
 *
 * 输出：
 * 返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
 *
 * 说明：
 * "aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
 * 示例 2：
 *
 * 输入：
 * ["a"]
 *
 * 输出：
 * 返回1，输入数组的前1个字符应该是：["a"]
 *
 * 说明：
 * 没有任何字符串被替代。
 * 示例 3：
 *
 * 输入：
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 *
 * 输出：
 * 返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
 *
 * 说明：
 * 由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
 * 注意每个数字在数组中都有它自己的位置。
 * 注意：
 *
 * 所有字符都有一个ASCII值在[35, 126]区间内。
 * 1 <= len(chars) <= 1000。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution443 {
    /**
     * 该算法没有满足题目要求，空间占用不是O（1）
     * 思路：
     * 遍历，计算重复字符的长度，遇到和上个字符相同时，令计数器+1
     * 遇到不同时，令上次相同的字符和长度组合为一个字符串，加入到str中
     * 遍历结束后令上次相同的字符和长度组合为一个字符串，加入到str中
     *
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        if(chars.length==1) return 1;

        //得出str
        char ch=chars[0];
        String str="";
        int c=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==ch){//相同：计数器+1
                c++;
            }else{//不同：上次匹配的存储到str
                if(c>1) str+=ch+""+c;
                else str+=ch;
                c=1;
            }
            ch=chars[i];
        }
        //最后匹配到存储到str
        if(c>1) str+=ch+""+c;
        else str+=ch;

        //修改chars数组的值
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }

    public static void main(String[] args) {
        char[] chars = {
                'a', 'a', 'b', 'b', 'c', 'c', 'c'
        };
        int r = new Solution443().compress(chars);
        System.out.println(r);
    }
}
