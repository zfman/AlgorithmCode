package offer;

/**
 * 矩形覆盖
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class RectCoverSolution {
    public int RectCover(int target) {
        if(target==0) return 0;
        if(target==1||target==2) return target;
        int i=3;
        int tmp1=1;
        int tmp2=2;
        int v=0;
        while (i<=target){
            v=tmp1+tmp2;
            tmp1=tmp2;
            tmp2=v;
            i++;
        }
        return v;
    }

    public static void main(String[] args) {
        int target=4;
        int r = new RectCoverSolution().RectCover(target);
        System.out.println(r);
    }
}
