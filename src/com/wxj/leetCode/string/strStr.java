package com.wxj.leetCode.string;

/*
实现 strStr() 函数。

        给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1
*/

public class strStr {

    public static void main(String[] args) {

    }

//    public int strStr(String haystack, String needle) {
//        if(needle.length() == 0 || haystack.equals(needle)){
//            return 0;
//        }
//
//        String[] split =  haystack.split(needle);
//        if(split.length == 0){
//            return 0;
//        }
//
//        if(split[0].equals(haystack)){
//            return -1;
//        }
//
//        return split[0].length();
//    }

    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }

        int left = 0,right = 0,index = 0;
        while(right < haystack.length() && index < needle.length()){
            if(haystack.charAt(right) != needle.charAt(index)){
                left++;
                right = left;
                index = 0;
            }else{
                right++;
                index++;
            }
        }

        return index == needle.length() ? left : -1 ;
    }
}
