package com.wxj.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO字符串中的第一个唯一字符
 *
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *
 * @date 2021/6/1 0001 15:56
 */
public class testFirstUniqChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

//        for (int i = 0; i < s.length()-1;i++){
////           map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            map.put(s.charAt(i),map.getOrDefault())
//        }
        for (Character ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


       for (int i = 0 ; i <= s.length() -1; i++){
           if(map.get(s.charAt(i)) == 1){
               return i;
           }
       }

       return  -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("z"));
    }
}