package leetcode.all;

/**
 * 回文数.
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 * 输入: 121
 * 输出: true
 *
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3:
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution9 {

    /**
     * 反转所有的数字，比较和原值是否相同.
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        int t=x;
        if(x<0) return false;
        if(x<10) return true;
        long m=0;
        while(x!=0){
            m=(m+x%10)*10;
            x=x/10;
        }

        m=m/10;
        if(m==t) return true;
        return false;
    }

    /**
     * 反转一半的数字.
     * 详见<a href="https://leetcode-cn.com/articles/palindrome-number/">题目解析</>
     *
     * 首先，我们应该处理一些临界情况。所有负数都不可能是回文，
     * 例如：-123 不是回文，因为 - 不等于 3。所以我们可以对所有负数返回 false。
     *
     * 现在，让我们来考虑如何反转后半部分的数字。
     * 对于数字 1221，如果执行 1221 % 10，我们将得到最后一位数字 1，要得到倒数第二位数字，
     * 我们可以先通过除以 10 把最后一位数字从 1221 中移除，1221 / 10 = 122，再求出上一步结果除以10的余数，
     * 122 % 10 = 2，就可以得到倒数第二位数字。如果我们把最后一位数字乘以10，再加上倒数第二位数字，
     * 1 * 10 + 2 = 12，就得到了我们想要的反转后的数字。 如果继续这个过程，我们将得到更多位数的反转数字。
     *
     * 现在的问题是，我们如何知道反转数字的位数已经达到原始数字位数的一半？
     *
     * 我们将原始数字除以 10，然后给反转后的数字乘上 10，所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。
     *
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x<0||(x%10==0&&x!=0)) return false;

        int revertedNumber=0;
        while(x>revertedNumber){
            revertedNumber=revertedNumber*10+x%10;
            x/=10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x==revertedNumber||x==revertedNumber/10;
    }

    public static void main(String[] args) {
        int x=1000000001;
        boolean b = new Solution9().isPalindrome(x);
        boolean b2 = new Solution9().isPalindrome2(x);
        System.out.println("Method1:"+b);
        System.out.println("Method2:"+b2);
    }
}
