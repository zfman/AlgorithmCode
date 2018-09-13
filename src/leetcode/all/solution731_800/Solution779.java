package leetcode.all.solution731_800;

/**
 * 779. 第K个语法符号
 *
 * 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
 *
 * 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
 *
 *
 * 例子:
 *
 * 输入: N = 1, K = 1
 * 输出: 0
 *
 * 输入: N = 2, K = 1
 * 输出: 0
 *
 * 输入: N = 2, K = 2
 * 输出: 1
 *
 * 输入: N = 4, K = 5
 * 输出: 1
 *
 * 解释:
 * 第一行: 0
 * 第二行: 01
 * 第三行: 0110
 * 第四行: 01101001
 *
 * 注意：
 *
 * N 的范围 [1, 30].
 * K 的范围 [1, 2^(N-1)].
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution779 {
    public int kthGrammar(int N, int K) {
        if(K==1) return 0;
        if(K%2==0){
            return kthGrammar(N-1,K/2)==0?1:0;
        }else{
            return kthGrammar(N-1,(K+1)/2)==0?0:1;
        }
    }

    public static void main(String[] args){
        int n=30;
        int k=434991989;
        int r=new Solution779().kthGrammar(n,k);
        System.out.println(r);
    }
}
