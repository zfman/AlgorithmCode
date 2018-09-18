package sort2;

import utils.ArrayUtils;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Insertion {
    public static void main(String[] args) {
        int[] m = {
                3, 1, 5, 8, 4, 6, 9, 2, 4, 0
        };

        int n = m.length;
        for (int i = 1; i < n; i++) {
            for(int j=i;j>0&&m[j]<m[j-1];j--){
                int tmp=m[j];
                m[j]=m[j-1];
                m[j-1]=tmp;
            }
        }

        ArrayUtils.printArray(m);
    }
}
