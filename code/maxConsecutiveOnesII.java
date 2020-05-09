// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3230/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int prev1s=0, after1s=0;
        boolean all1s = true;
        for(int num: nums) {
            if(num == 1) after1s++;
            else {
                all1s = false;
                max = Math.max(max, 1 + prev1s + after1s);
                prev1s = after1s;
                after1s = 0;
            }
        }
        
        if(all1s) max = nums.length;
        else max = Math.max(max, 1 + prev1s + after1s);
        
        return max;
    }
}
