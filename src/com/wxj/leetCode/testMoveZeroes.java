package com.wxj.leetCode;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 *
 * 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12] -> [1,0,3,12,0] -> [1,3,12,0,0]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 *
 *     必须在原数组上操作，不能拷贝额外的数组。
 *     尽量减少操作次数。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @date 2021/5/8 0008 17:08
 */
public class testMoveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        if(nums == null || nums.length == 0){
            return;
        }
        int index = 0;

        // 将数组中的不等于 0 的数据都往前移动
        for (int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        // 这时 index 的大小就是 nums 中含有 0 的 个数  [1,3,12,3,12]
        // 这里 nums[index++] index = 3  index[3++] = 3 正好将 后面的 3 替换成 0
        while (index < nums.length){
            nums[index++] = 0;
        }


    }
}