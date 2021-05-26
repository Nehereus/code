import org.graalvm.compiler.core.common.cfg.PrintableCFG;

/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    int num = 0;

    public int numDecodings(String s) {
        if (s.length() == 0) {
                num++;
                return 0;
        } else {

            if (s.length() >= 2) {
                if (Integer.parseInt(s.substring(0, 2)) <= 26) {
                    if ((int) s.charAt(0) == 48) {
                        return 0;
                    }
                    numDecodings(s.substring(2));
                }
            }
            if (s.length() >= 1) {
                if ((int) s.charAt(0) == 48) {
                    return 0;
                }
                numDecodings(s.substring(1));

            }

        }
        return num;
    }

    // @lc code=end

    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.numDecodings("111111111111111111111111111111111111111111111"));
    }
}