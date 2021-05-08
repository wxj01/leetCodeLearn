package com.wxj.leetCode;

import java.util.Arrays;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 * 加一
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 *
 * 示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 *
 * 示例 2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 *
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *
 *
 *
 * 提示：
 *
 *     1 <= digits.length <= 100
 *     0 <= digits[i] <= 9
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @date 2021/5/8 0008 16:31
 */
public class testPlusOne {
    public static void main(String[] args) {
//        int[] digits = {0};
        int[] digits = {4,3,2,1};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        // 从数组的尾部开始，也就是从个位开始
        // i >= 0 ,之前弄成 i > 0  ,导致 数组为 int[] digits = {0}; 的结果直接就 [1,0] 了
        for (int i = digits.length -1;i >= 0 ; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else {
                // 位数为9 的加一后变成 0，可以理解为个位是9 变成0 ，然后到 十位
                digits[i] = 0;

                // 这里没有return，如果为9 就会走到上一步  digits[i] != 9
            }
        }
        // 如果数组都是9 会进位，长度+ 1
        int[] temp = new int[digits.length+ 1] ;
        temp[0] = 1;
        return temp;
    }
}