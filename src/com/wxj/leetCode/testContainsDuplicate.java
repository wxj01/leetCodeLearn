package com.wxj.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 存在重复元素
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 *
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 *
 * 示例 3:
 *
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
public class testContainsDuplicate {
    public static void main(String[] args) {
         int[] nums =  {1,2,3,1};

        System.out.println("aaa:"+containsDuplicate3(nums));

    }


    public static boolean containsDuplicate(int[] nums) {

        if(nums.length < 2){
            return false;
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){

            if(!map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],0);
            }
        }
        return false;
    }


    public static boolean containsDuplicate2(int[] nums) {

        Set ints = new HashSet<Integer>();
        for (int i = 0 ;i < nums.length;i++){
            if(!ints.add(nums[i])){
                return true;
            }
        }
        return false;
    }


    public static boolean containsDuplicate3(int[] nums) {

        Set ints = new HashSet<Integer>();
        for (int i = 0 ;i < nums.length;i++){
            if(ints.add(nums[i])){
                continue;
            }else {
                return  true;
            }
        }
        return false;
    }


   /* public static boolean containsDuplicate4(int[] nums) {

//        [1,2,3,1]
        int index = 0;
        for (int i = 1;i < nums.length;i ++){
            if(nums[index] != nums[i]){

            }
        }
    }*/

}
