class Solution {
    /* 
        if elements to remove are rare, this is more efficient
        n: array length
        time: O(n)
        space: O(1)
    */
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        
        int left = 0, right = nums.length-1;
        while(left < right) {
            if(nums[left] == val) {
                nums[left] = nums[right];
                nums[right] = val;
                right--;
            } else left++;
        }
        
        return nums[left] == val ? left : left+1;
    }

    /* 
        trivial approach
        n: array length
        time: O(n)
        space: O(1)
    
    public int removeElement(int[] nums, int val) {
        int realIndex = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                if(i != realIndex) nums[realIndex] = nums[i];
                realIndex++;
            }
        }
        
        return realIndex;
    }
    */
}
