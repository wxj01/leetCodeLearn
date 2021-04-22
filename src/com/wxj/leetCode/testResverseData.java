package com.wxj.leetCode;

/**
 * @author wxj
 * @version 1.0
 * @description: TODO
 *
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @date 2021/4/16 0016 10:18
 */
public class testResverseData {

    public static void main(String[] args) {

     /*   示例 1：

        输入：x = 123
        输出：321

        示例 2：

        输入：x = -123
        输出：-321

        示例 3：

        输入：x = 120
        输出：21

        示例 4：

        输入：x = 0
        输出：0*/

//        int reverse = reverse(123);  // OK
        int reverse = reverse2(-123); // OK
//        int reverse = reverse(120); // OK
//        int reverse = reverse(0); // OK
//        int reverse = reverse(1534236469); // OK

        System.out.println(reverse);

    }

    public static int reverse(int x) {

       /*
        1.判断是否 是非负整数
        2.想办法将整数拆成一个个数，然后放到数组中
       */

        String x2str = String.valueOf(x);
        char[] chars = x2str.toCharArray();
        StringBuffer sb = new StringBuffer();
        // 判断整数是否非负
        int limitNum = 0;
        int flag = 0;
        if(x < 0){
            limitNum = 1;
            flag = -1;
        }

        for (int i = chars.length-1;i >=limitNum;i--){
            sb.append(chars[i]);
        }

        // 反转后的数据不能超出整形范围
        Long aLong = Long.valueOf(sb.toString());
        if(aLong > 2147483647  || aLong *(-1) < -2147483648){
            return 0;
        }
        if(flag < 0){
            return aLong.intValue() *(-1);
        }
        return aLong.intValue();
    }


    public static int reverse2(int x) {

       /*
        1.判断是否 是非负整数
        2.想办法将整数拆成一个个数，然后放到数组中
       */

        String x2str = String.valueOf(x);
        char[] chars = x2str.toCharArray();
        StringBuffer sb = new StringBuffer();
        // 判断整数是否非负
        int limitNum = 0;
        int flag = 0;
        if(x < 0){
            limitNum = 1;
            flag = -1;
        }




        // 反转后的数据不能超出整形范围
        Long aLong = Long.valueOf(sb.toString());
        if(aLong > 2147483647  || aLong *(-1) < -2147483648){
            return 0;
        }
        if(flag < 0){
            return aLong.intValue() *(-1);
        }
        return aLong.intValue();
    }

}