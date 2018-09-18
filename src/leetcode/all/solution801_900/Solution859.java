package leetcode.all.solution801_900;

/**
 * 859. 亲密字符串
 *
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 *
 *
 *
 * 示例 1：
 *
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 示例 2：
 *
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 示例 3:
 *
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 示例 4：
 *
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 *
 * 输入： A = "", B = "aa"
 * 输出： false
 *
 *
 * 提示：
 *
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A 和 B 仅由小写字母构成。
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution859 {
    /**
     * 从第0个元素开始，依次与后续元素交换，比较是否相同
     * 如果交换元素相同，可直接使用缓存好的boolean来判断，
     * 可节省很多时间
     *
     * @param A
     * @param B
     * @return
     */
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length()) return false;
        boolean isSame=A.equals(B);
        char[] arr=A.toCharArray();
        for(int i=0;i<A.length()-1;i++){
            for(int j=i+1;j<A.length();j++){
                //重要：提高性能
                if(arr[i]==arr[j]){
                    if(isSame) return true;
                    else continue;
                }
                swap(arr,i,j);//交换
                String ss=new String(arr);
                if(ss.equals(B)) return true;
                swap(arr,i,j);//恢复
            }
        }

        return false;
    }

    public void swap(char[] a,int i,int j){
        char tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void main(String[] args){
        String a="aa";
        String b="aa";
        boolean r=new Solution859().buddyStrings(a,b);
        System.out.println(r);
    }
}
