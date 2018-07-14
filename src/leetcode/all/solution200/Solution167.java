package leetcode.all.solution200;

/**
 * 未完成
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        return null;
//        if(numbers==null||numbers.length==0) return null;
//        int pos2=0,pos1=0;
//        int i=0;
//        for(;i<numbers.length;i++){
//            if(numbers[i]>target){
//                pos2=i-1;
//                break;
//            }
//        }
//        if(pos2<0) return null;
//
//
//        target = target-numbers[pos2];
//        for(int i=0;i<pos2;i++){
//            if(numbers[i]>target){
//                pos1=i-1;
//                break;
//            }
//        }
//        if(pos1<0) return null;
//
//        int[] r=new int[2];
//        r[0]=pos1+1;
//        r[1]=pos2+1;
//        return r;
    }

    public static void main(String[] args) {
        int[] numbers = {
                2, 3,4
        };
        int target = 6;
        int[] r = new Solution167().twoSum(numbers, target);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
