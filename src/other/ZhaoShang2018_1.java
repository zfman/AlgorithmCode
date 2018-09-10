package other;

import java.util.ArrayList;
import java.util.List;

/**
 * 招商银行2018笔试题
 *
 * 给出一个正整数n，请给出所有的包含n个'('和n个')'的字符串，使得'('和')'可以完全匹配。
 * 例如：
 * '(())()'，'()()()' 都是合法的；
 * '())()('是不合法的。
 * 请按照__字典序__给出所有合法的字符串。
 *
 * 输入描述:
 * 输入为1个正整数
 *
 *
 * 输出描述:
 * 输出为所有合法的字符串，用英文逗号隔开
 * 示例1
 * 输入
 * 2
 * 输出
 * (()),()()
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class ZhaoShang2018_1 {
    public List<String> generateParenthesis(int n){
        List<String> ret=new ArrayList<>();
        dfs(n,0,0,"",ret);
        return ret;
    }

    /**
     * 深度优先
     *
     * 1.如果满足条件，将当前str保存，否则继续
     * 2.左括号小于n，继续添加左括号
     * 3.右括号小于n&左括号大于右括号，补充右括号
     *
     * @param n
     * @param l 左括号数量
     * @param r 右括号数量
     * @param str 本轮次的字符串
     * @param ret 保存所有结果
     */
    public void dfs(int n,int l,int r,String str,List<String> ret){
        if(l>=n&&r>=n) {
            ret.add(str);
            return;
        }
        if(l<n){
            dfs(n,l+1,r,str+"(",ret);
        }
        if(l>r&&r<n){
            dfs(n,l,r+1,str+")",ret);
        }
    }

    public static void main(String[] args){
        List<String> r=new ZhaoShang2018_1().generateParenthesis(3);
        for (String s:r){
            System.out.println(s);
        }
    }
}
