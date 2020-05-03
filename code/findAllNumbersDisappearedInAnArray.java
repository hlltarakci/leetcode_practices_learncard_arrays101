// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/

class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearList = new ArrayList<>();
        if(nums == null) return disappearList;
        
        int addFactor = nums.length + 1;
        for(int i=0; i<nums.length; i++) {
            int index = (nums[i] % addFactor) - 1;
            nums[index] += addFactor;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < addFactor) disappearList.add(i+1);
        }
        
        return disappearList;
    }
}
