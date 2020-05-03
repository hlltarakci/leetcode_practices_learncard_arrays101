// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/

class Solution {
    /*
        n: arr length
        time: O(n)
        space: O(1)
    */
    public int[] replaceElements(int[] arr) {
        int maxSoFar = -1;
        for(int i=arr.length-1; i>=0; i--) {
            int elem = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, elem);
        }
        
        return arr;
    }
}
