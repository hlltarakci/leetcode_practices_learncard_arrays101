// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/

class Solution {
    /*
        n: arr length
        time: O(n)
        space: O(1)
    */
    public int[] sortArrayByParity(int[] A) {
        if(A == null) return A;
        
        int left = 0, right = A.length-1;
        while(left < right) {
            if(isEven(A[left])) left++;
            else if(!isEven(A[right])) right--;
            else swap(A, left, right);
        }
        
        return A;
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    private void swap(int[]A, int left, int right) {
        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}
