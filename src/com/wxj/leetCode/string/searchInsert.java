package com.wxj.leetCode.string;

/*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

        你可以假设数组中无重复元素。*/
public class searchInsert {

    public static void main(String[] args) {
        int[] nums = {3,1,5,6};

        System.out.println(searchInsert(nums,4));
    }

    public  static  int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }

        return  nums.length;
    }


//    public  static  int searchInsert(int[] nums, int target) {
//
//        int left = 0;
//        int right = nums.length-1;
//
//
//        while (left <= right){
//            int mid = (left+ right)/2;
//            if( target > nums[mid]){
//                left = mid+1;
//            }else if(target < nums[mid]){
//                right = mid -1;
//            }else {
//                return mid;
//            }
//        }
//
//        return -1;
//    }
}
