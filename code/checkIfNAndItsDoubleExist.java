// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/

class Solution {
    /*
        n: array length
        time: O(n)
        space: O(n) -- set usage
    */
    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length < 2) return false;
        Set<Integer> set = new HashSet<>();
        for(int num: arr) {
            if(set.contains(num*2) || ( num%2 == 0 && set.contains(num/2))) return true;
            set.add(num);
        }
        
        return false;
    }
}
