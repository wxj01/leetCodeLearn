/**
  * 题目Id：67
  * 题目：二进制求和
  * 日期：2022-01-26 14:41:01
*/
//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 👍 734 👎 0

package com.wxj.leetCode.leetcode.editor.cn;
public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb  = new StringBuilder();
        int carry = 0;
        for (int i = a.length() -1,j = b.length() -1;
             i >= 0 || j >= 0;
             i--,j--) {
            int sum = carry;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            sb.append( sum % 2);
            carry = sum / 2;
        }
        sb.append( carry == 1 ? carry : "");
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 