import java.util.ArrayList;

/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 *
 * https://leetcode.com/problems/trapping-rain-water/description/
 *
 * algorithms
 * Hard (50.98%)
 * Likes:    11670
 * Dislikes: 170
 * Total Accepted:    762.5K
 * Total Submissions: 1.5M
 * Testcase Example:  '[0,1,0,2,1,0,1,3,2,1,2,1]'
 *
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it can trap after raining.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array
 * [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue
 * section) are being trapped.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * n == height.length
 * 0 <= n <= 3 * 10^4
 * 0 <= height[i] <= 10^5
 * 
 * 
 */

// @lc code=start

//this solution should work but with a horrible time complexity.
class Solution {
    public int trap(int[] height) {
        if (height.length==0)
        return 0;
        int[] fromLeft = new int[height.length];
        int[] fromRight = new int[height.length];
        fromLeft[0] = height[0];
        fromRight[0] = height[height.length-1];
        for(int i = 1; i<height.length;i++){
            fromLeft[i] = fromLeft[i-1]< height[i] ?  height[i]:fromLeft[i-1];
            fromRight[i] = fromRight[i-1]< height[height.length-i-1] ?  height[height.length-i-1]:fromRight[i-1];
        }
        int ans = 0;
        for(int i = 0; i<height.length;i++){
            ans += Math.min(fromLeft[i], fromRight[height.length-i-1]) - height[i];
        }
        return ans;
    }
}
// @lc code=end

//what we need to do is to find interval where the first value is smaller than the second. like [1,2], [3,4], and then we can calculate the volume of trapping water with the first value - current height.


