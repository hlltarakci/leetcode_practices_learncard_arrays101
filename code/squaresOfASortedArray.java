// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/

class Solution {
    /*
        solution that takes advantage of the original array being sorted
        n: array length
        time: O(n)
        space: O(n) => space for output
    */
    public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        int lastIndex = A.length-1, left = 0, right = A.length-1;
        while(left <= right) {
            if(Math.abs(A[left]) > Math.abs(A[right])) {
                squares[lastIndex--] = A[left] * A[left];
                left++;
            } else {
                squares[lastIndex--] = A[right] * A[right];
                right--;
            }
        }
        
        return squares;
    }
    
    /*
        more trivial, straightforward solution
        n: array length
        time: O(n log n) => n for loop + n log n for sort
        space: O(n) => space for output
    */
    /*
    public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        
        for(int i=0; i<A.length; i++) {
            squares[i] = A[i] * A[i];
        }
        
        Arrays.sort(squares);
        return squares;
    }
    */
}
