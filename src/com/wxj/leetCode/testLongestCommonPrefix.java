package com.wxj.leetCode;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 *
 * 提示：
 *
 *     0 <= strs.length <= 200
 *     0 <= strs[i].length <= 200
 *     strs[i] 仅由小写英文字母组成
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @date 2021/6/1 0001 17:27
 */
public class testLongestCommonPrefix {
    public  static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        // 默认第一个字符串就是他们的公共前缀
        String pre = strs[0];
        for (int i = 1 ; i <= strs.length -1; i++){

            // 不断的截取 indexof  没有找到返回 -1  ，这里pre 没有找到，就截取一个
            while (strs[i].indexOf(pre) != 0){
                pre = pre.substring(0,pre.length()-1);
            }

//            if(strs[i].indexOf(pre) != 0){
//
//
//            }
        }
        return pre;


    }

    public static void main(String[] args) {
//        String[] strs = {"abc","abd"};
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}