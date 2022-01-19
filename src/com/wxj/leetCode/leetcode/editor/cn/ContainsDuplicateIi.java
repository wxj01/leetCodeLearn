/**
  * 题目Id：219
  * 题目：存在重复元素 II
  * 日期：2022-01-19 14:30:03
*/
//给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i 
//- j) <= k 。如果存在，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,1], k = 3
//输出：true 
//
// 示例 2： 
//
// 
//输入：nums = [1,0,1,1], k = 1
//输出：true 
//
// 示例 3： 
//
// 
//输入：nums = [1,2,3,1,2,3], k = 2
//输出：false 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 0 <= k <= 10⁵ 
// 
// Related Topics 数组 哈希表 滑动窗口 👍 403 👎 0

package com.wxj.leetCode.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIi {
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicateIi().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if (nums == null || nums.length == 0 || nums.length < k ){
            return false;
        }

        Map<Integer,Integer> map = new HashMap<>();
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            int other  =  target + nums[i];
            if(map.containsKey(other)){
                if(Math.abs(i - map.get(other)) == k){
                    return  true;
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 