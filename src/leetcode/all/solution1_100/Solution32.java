package leetcode.all.solution1_100;

import java.util.Stack;

/**
 * 32. 最长有效括号
 *
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 *
 * 示例 1:
 *
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * 示例 2:
 *
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution32 {

    /**
     * 动态规划解法
     * @param s
     * @return
     */
    public int longestValidParentheses2(String s) {
        int[] dp=new int[s.length()];
        int max=0;
        int pre=0;
        if(s==null||s.trim().equals("")) return 0;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==')'){
                pre=i-dp[i-1]-1;
                if(pre>=0&&s.charAt(pre)=='('){
                    dp[i]=dp[i-1]+2+(pre>0?dp[pre-1]:0);
                    if(dp[i]>max) max=dp[i];
                }
            }
        }

//        for(int i=0;i<dp.length;i++){
//            System.out.print(dp[i]+" ");
//        }
        return 0;
    }

    /**
     * 非动态规划解法：
     *
     * c表示当前未被匹配的左括号的数量，-1表示左括号，1表示右括号
     * 如果是左括号，将-1压入栈中
     * 如果是右括号：
     *      如果c==0,表示此时没有未被匹配的左括号，直接将1压入栈中即可
     *      c!=0，找到距离栈顶最近的元素，如果栈顶是2，4..6这样的数字应该将累计，同时c--
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer> stack=new Stack<>();
        int c=0;//当前未被匹配的左括号的数量
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(-1);
                c++;
            }else{
                if(c==0) stack.push(1);
                else{
                    c--;
                    int flag=0;
                    while (stack.peek()!=-1){
                        flag+=stack.peek();
                        stack.pop();
                    }
                    stack.pop();
                    stack.push(flag+2);
                }
            }
        }

        int tmp=0;
        while(!stack.isEmpty()){
            int x=stack.pop();
            if(x!=-1&&x!=1){
                tmp+=x;
            }else{
                max=Math.max(tmp,max);
                tmp=0;
            }
        }
        max=Math.max(max,tmp);
        return max;
    }
    public static void main(String[] args){
        String s="()(())(";
        int r=new Solution32().longestValidParentheses(s);
        int r2=new Solution32().longestValidParentheses2(s);
        System.out.println();
        System.out.println("非动态规划:"+r);
        System.out.println("动态规划:"+r2);
        //b[]:0 2 0 0 2 6 0
    }
}
