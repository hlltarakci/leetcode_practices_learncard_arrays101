// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

class Solution {
    /*
        n: array size
        time: O(n)
        space: O(1)
    */
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, soFarCount = 0;
        for(int num: nums) {
            if(num == 1) soFarCount++;
            else {
                maxCount = Math.max(maxCount, soFarCount);
                soFarCount = 0;
            }
            
        }
        maxCount = Math.max(maxCount, soFarCount);
        
        return maxCount;
    }
}
