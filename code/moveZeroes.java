// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/

class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public void moveZeroes(int[] nums) {
        if(nums == null) return;
        
        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) 
                continue;
            
            nums[index] = nums[i];
            if(i != index) nums[i] = 0;
            index++;
        }
    }
}
