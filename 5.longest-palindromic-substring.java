/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 *
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 *
 * algorithms
 * Medium (30.44%)
 * Likes:    10973
 * Dislikes: 700
 * Total Accepted:    1.3M
 * Total Submissions: 4.3M
 * Testcase Example:  '"babad"'
 *
 * Given a string s, return the longest palindromic substring in s.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "cbbd"
 * Output: "bb"
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: s = "a"
 * Output: "a"
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: s = "ac"
 * Output: "a"
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters (lower-case and/or
 * upper-case),
 * 
 *
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String ans ="";
        if(s.length()<=1)
        return s;

            for (int i=1;i<s.length()-1;i++){
                int l=i;
                int r=i;

                while(l>0&&r<s.length()-1){
                    if (s.charAt(l-1)==s.charAt(r+1)){
                    l--;
                    r++;
                    continue;
                    }
                    break;
                }
                if (ans.length()<r-l+1)
                ans = s.substring(l, r+1);
            }

            for (int i=0;i<s.length()-1;i++){
                int l=i;
                int r=i+1;
                if(s.charAt(l)!=s.charAt(r))
                continue;

                while(l>0&&r<s.length()-1){
                    if (s.charAt(l-1)==s.charAt(r+1)){
                    l--;
                    r++;
                    continue;
                    }
                    break;
                }
                if (ans.length()<r-l+1)
                ans = s.substring(l, r+1);
            }

            if(ans.length()==0)
            return Character.toString(s.charAt(0)) ;

            return ans;
            
    }

}
// @lc code=end

