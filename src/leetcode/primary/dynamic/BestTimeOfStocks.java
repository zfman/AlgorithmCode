package leetcode.primary.dynamic;

/**
 * 买卖股票的最佳时机.
 * 
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票
 * 
 * 示例 1:
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 
 * 示例 2:
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * 
 * @author 刘壮飞
 * https://github.com/zfman.
 * https://blog.csdn.net/lzhuangfei.
 */
public class BestTimeOfStocks {
	
	/**
	 * 计算最大利润.
	 * 
	 * 求出股票价格的波动，然后问题转化为：
	 * 计算波动数组的最大子序和
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
        int[] a=new int[prices.length];
		for(int i=0;i<prices.length-1;i++){
			a[i]=prices[i+1]-prices[i];
		}
        return maxSubArray(a);
    }
    
	/**
	 * 最大子序和.
	 * 
	 * @param nums
	 * @return
	 */
    private int maxSubArray(int[] nums) {
		if(nums.length==0) return 0;
		int tmp=nums[0];
		int sum=nums[0];
		
		for(int i=1;i<nums.length;i++){
			if(tmp>0){
				tmp+=nums[i];
				if(tmp>sum){
					sum=tmp;
				}
			}else{
				tmp=nums[i];
				if(tmp>sum){
					sum=tmp;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] prices={
				7,1,5,3,6,4
		};
		int r=new BestTimeOfStocks().maxProfit(prices);
		System.out.println(r);
	}
}
