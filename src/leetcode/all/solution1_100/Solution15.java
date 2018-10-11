package leetcode.all.solution1_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class Solution15 {

    /**
     * 双指针：先排序，然后指定第一个数，求解后面两数之和等于该数的相反数
     * i指向第一个数之后的一个数，j指向末尾
     * 如果此时三数之和等于0，那么将三个数记录
     * 如果三数之和>0，j向前移动
     * 如果三数之和<0，i向后移动
     *
     * 注意去重
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int k=i+1;//前指针：指向第2个数
            int v=nums.length-1;//后指针：指向第3个数
            if(nums[i]>0) continue;
            //以下一行用来去重
            if(i>0&&nums[i]==nums[i-1]) continue;

            while(k<v){
                int sum=nums[i]+nums[k]+nums[v];
                if(sum==0){
                    r.add(Arrays.asList(nums[i],nums[k],nums[v]));
                    //以下两行用来去重
                    while(k<v&&nums[k]==nums[k+1]) k++;
                    while(k<v&&nums[v]==nums[v-1]) v--;
                    v--;
                    k++;
                }else if(sum>0){
                    v--;
                }else{
                    k++;
                }
            }
        }
        return r;
    }

    public static void main(String[] args){
        int[] nums={
                -4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0
        };
        List<List<Integer>> r=new Solution15().threeSum(nums);
        for(List<Integer> l:r){
            for(Integer i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


