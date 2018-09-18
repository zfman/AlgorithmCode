package leetcode.common;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class OtherUtils {
    // 最大公约数
    public static int get_gcd(int a, int b) {
        int max, min;
        min=Math.min(a,b);
        max=Math.max(a,b);

        if (max % min != 0) {
            return get_gcd(min, max % min);
        } else
            return min;

    }

    // 最小公倍数
    public static int get_lcm(int a, int b) {
        return a * b / get_gcd(a, b);
    }
}
