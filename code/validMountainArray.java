// https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

class Solution {
    /*
        n: array length
        time: O(n)
        space: O(1)
    */
    public boolean validMountainArray(int[] A) {
        if(A == null || A.length < 3) return false;
        boolean isIncreasing = true;
        for(int i=1; i<A.length; i++) {
            if(isIncreasing) {
                if(A[i] < A[i-1]) {
                    if( i==1) return false;
                    isIncreasing = false;
                }
                else if(A[i] == A[i-1]) return false;
            } else {
                if(A[i] >= A[i-1]) return false;
            }
        }
        
        return !isIncreasing;
    }
}
