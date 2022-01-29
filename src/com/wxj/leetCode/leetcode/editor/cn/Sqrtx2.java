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
 * @author wangxinjian
 * @date 2022/1/27 0027 13:51
 * @version 1.0
 */
public class Sqrtx2 {
    public static void main(String[] args) {
        Solution solution = new Sqrtx2().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int s = 0;
        if(x == 0){ return 0 ;}
        double res =  (double)(x + s/x) / 2;
        if (res == x){
            return x;
        }else {
            return mySqrt((int) res);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 