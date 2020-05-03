// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/

class Solution {
    /*
        n: arr length
        time: O(n)
        space: O(1)
    */
    public int thirdMax(int[] nums) {
        long[] maxs = new long[3];
        Arrays.fill(maxs, Long.MIN_VALUE);
        
        for(int num: nums) {
            if(num == maxs[0] || num == maxs[1] || num == maxs[2]) continue;
            
            if(num > maxs[2]) {
                maxs[0] = maxs[1];
                maxs[1] = maxs[2];
                maxs[2] = num;
            } else if(num > maxs[1]) {
                maxs[0] = maxs[1];
                maxs[1] = num;
            } else if(num > maxs[0]) {
                maxs[0] = num;
            }
        }
        
        return maxs[0] > Long.MIN_VALUE ? (int)maxs[0] : (int)maxs[2];
    }
}
