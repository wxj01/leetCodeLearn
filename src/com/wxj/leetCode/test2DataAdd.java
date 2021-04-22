package com.wxj.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @date 2021/4/16 0016 9:00
 */
public class test2DataAdd {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7};
//        int[] result = new int[2];
        //           8,6,4,3,2
        //          {8:0} {6:1}  {4:2}  {3:3} {2:4}
        int target = 9;

        get2Index(arr,target);


    }

    public static int[] get2Index(int[] nums,int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            int dif = target - nums[i];
            if(map.containsKey(dif)){
                return new int[]{map.get(dif),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }

}