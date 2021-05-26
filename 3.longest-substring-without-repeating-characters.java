import java.util.HashMap;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
      char[] carr =  s.toCharArray();
      int Longest = 0;
      for (int i =0;i<s.length();i++){
          int val = findSubstring(i,s.length(), carr);
          if (val>Longest)
          Longest = val;

      }
        return Longest;
    }

    public int findSubstring(int start,int max,  char[] s) {
        HashMap<Character,Character> charLibrary = new  HashMap<Character,Character>();
        int i = start;
        int count = 0;
        char c =s[i];
        while(!charLibrary.containsKey(s[i])){
            c = s[i];
            charLibrary.put(c,c);
            i++;
            count++;
            if (i>=max)
            break;
        }
        // System.out.println("s"+count);
        return count;
    }
}
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {

int l =0;
int r = 0;
int max =0;
HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
while(r<s.length()-1){
hm.put((int)s.charAt(r), (int)s.charAt(r));
r++;
while(hm.containsKey((int)s.charAt(r))){
hm.remove((int)s.charAt(l));
l++;
}
max = Math.max(max, r-l+1);
    }
    if(s.length()==1)
    return 1;
    return max;
}
}
// @lc code=end
//slide window
