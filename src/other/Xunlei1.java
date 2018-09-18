package other;

/**
 * 数组中消失的数字
 *
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xunlei1 {

    /**
     * O(n)的算法
     * @param nums
     * @return
     */
    static int[] findDisappearedNum(int[] nums) {
        int[] n=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            n[nums[i]]++;
        }

        int c=0;
        for(int i=1;i<n.length;i++){
            if(n[i]==0) c++;
        }

        int[] r=new int[c];
        int m=0;
        for(int i=1;i<n.length;i++){
            if(n[i]==0) r[m++]=i;
        }
        return r;
    }



    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for (int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }

        res = findDisappearedNum(_nums);
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}

