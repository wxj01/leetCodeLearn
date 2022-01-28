/**
  * 题目Id：69
  * 题目：Sqrt(x)
  * 日期：2022-01-27 13:15:49
*/
//给你一个非负整数 x ，计算并返回 x 的 算术平方根 。 
//
// 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。 
//
// 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 4
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：x = 8
//输出：2
//解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
// Related Topics 数学 二分查找 👍 873 👎 0

package com.wxj.leetCode.leetcode.editor.cn;
/**
 * @description: TODO
 * 如果这个整数的平方 恰好等于 输入整数，那么我们就找到了这个整数；
 * 如果这个整数的平方 严格大于 输入整数，那么这个整数肯定不是我们要找的那个数；
 * 如果这个整数的平方 严格小于 输入整数，那么这个整数 可能 是我们要找的那个数（重点理解这句话）
 * @author wangxinjian
 * @date 2022/1/27 0027 13:51
 * @version 1.0
 */
public class Sqrtx {
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if (x == 0){return 0;}
        if (x == 1){return 1;}

        int left = 1;
        int right = x / 2;
        // 在区间 [left..right] 查找目标元素
        while(left < right){
            int mid = left + (right - left + 1) /2;
            //这里防止乘法溢出，用除法
            if (mid > x/mid){
                // 下一次 [left , mid -1]
                right = mid -1;
            }else {
                // 下一次[mid,right]
                left = mid;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 