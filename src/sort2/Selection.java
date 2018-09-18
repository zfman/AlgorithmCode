package sort2;

import utils.ArrayUtils;

/**
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Selection {
    public static void main(String[] args) {
        int[] m = {
                3, 1, 5, 8, 4, 6, 9, 2, 4, 0
        };

        int n = m.length;
        for (int i = 0; i < n; i++) {
            int min=i;
            for(int j=i+1;j<n;j++){
                if(m[j]<m[i]) min=j;
            }
            int tmp=m[i];
            m[i]=m[min];
            m[min]=tmp;
        }

        ArrayUtils.printArray(m);
    }
}
