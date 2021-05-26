/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 *
 * https://leetcode.com/problems/zigzag-conversion/description/
 *
 * algorithms
 * Medium (38.60%)
 * Likes:    2398
 * Dislikes: 5907
 * Total Accepted:    577.5K
 * Total Submissions: 1.5M
 * Testcase Example:  '"PAYPALISHIRING"\n3'
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for
 * better legibility)
 * 
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * 
 * Write the code that will take a string and make this conversion given a
 * number of rows:
 * 
 * 
 * string convert(string s, int numRows);
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "A", numRows = 1
 * Output: "A"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1)
        return s;

        StringBuilder sb =new StringBuilder();
        for (int i=0; i<numRows;i++){
            int a=i;
            while(a<s.length()){
        sb.append(s.charAt(a));
        if(i!=0&&i!=numRows-1&& a +(numRows-i)+(numRows-i)-2<s.length()){
            sb.append( s.charAt(a +(numRows-i)+(numRows-i)-2));
        }
        a+= 2*numRows-2;
            } 
        }
        return sb.toString();
    }
}
// @lc code=end

