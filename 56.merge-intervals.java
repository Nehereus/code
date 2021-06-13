import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 *
 * https://leetcode.com/problems/merge-intervals/description/
 *
 * algorithms
 * Medium (40.88%)
 * Likes:    7486
 * Dislikes: 388
 * Total Accepted:    907.9K
 * Total Submissions: 2.2M
 * Testcase Example:  '[[1,3],[2,6],[8,10],[15,18]]'
 *
 * Given an array of intervals where intervals[i] = [starti, endi], merge all
 * overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into
 * [1,6].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        boolean marker[] = new boolean[80000];
        for(int i=0;i<intervals.length;i++){
            int end = intervals[i][1];

            for(int start = intervals[i][0];start<=end;start++){
                if (start != intervals[i][0])
                marker[start*2-1] = true;
                marker[start*2] = true;
            }

        }

        Queue<Integer> ans =new LinkedList<>();
        boolean previous = false;
        
        for(int i =0;i<marker.length;i++){
            if(previous==false&&marker[i]==true)
            ans.add(i/2);
            if(previous==true&&marker[i]==false)
            ans.add((i-1)/2);
            previous = marker[i];
        }

        int[][] ans1 = new int[ans.size()/2][2];
        int i =0;
        while(!ans.isEmpty()){
            int[] temp = {ans.poll(),ans.poll()};
            ans1[i] =temp;
            i++;
        }

        return ans1;
    }

}
// @lc code=end

