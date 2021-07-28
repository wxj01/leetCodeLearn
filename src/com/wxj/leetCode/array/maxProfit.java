package com.wxj.leetCode.array;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO  121. 买卖股票的最佳时机
 *
 *
        记录【今天之前买入的最小值】
        计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
        比较【每天的最大获利】，取最大值即可

 *
 * @date 2021/7/28 0028 21:31
 */
public class maxProfit {
    public int maxProfit(int[] prices) {
       if(prices.length < 1){
           return 0;
       }

       int min= prices[0],max = 0;
       for (int i = 0; i < prices.length;i++){
           max = Math.max(max,prices[i]-min);
           min = Math.min(min,prices[i]);

       }
       return max;

    }


    public static void main(String[] args) {

    }
}