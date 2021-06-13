/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.89%)
 * Likes:    4300
 * Dislikes: 6636
 * Total Accepted:    1.4M
 * Total Submissions: 5.4M
 * Testcase Example:  '123'
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-2^31, 2^31 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed
 * or unsigned).
 * 
 * 
 * Example 1:
 * Input: x = 123
 * Output: 321
 * Example 2:
 * Input: x = -123
 * Output: -321
 * Example 3:
 * Input: x = 120
 * Output: 21
 * Example 4:
 * Input: x = 0
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * 
 * -2^31 <= x <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {

    public int reverse(int x) {
        boolean ifSigned =false;
        if (x<0){
        ifSigned =true;
        x = Math.abs(x);
        }
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        if(c.length%2!=0){
            for (int i= (c.length-1)/2;i<c.length;i++){
                helper(i,(c.length-1-i),c);
            }
        }else{
            for (int i= c.length/2;i<c.length;i++){
                helper(i,(c.length-1-i),c);
            }
        }
        String ans = new String(c);
        try{
        if (ifSigned)
        return -Integer.parseInt(ans);
        else{
            return Integer.parseInt(ans);    
        }
    }catch(Exception e){
        return 0;
    }

        
    }

    public char[] helper(int a, int b, char[] s){
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
        return s;
    }
}
// @lc code=end

