package com.wxj.leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 只出现一次的数字
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class testSingleNumber {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};

        System.out.println(singleNumber(nums));
    }

    // a^a = 0 ; a^0 = a
    public static int singleNumber(int[] nums) {

        int reduce = 0;
       for (int num: nums){
           reduce = reduce ^ num ;
       }
        return reduce;
    }

    public static int singleNumber2(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }

}
