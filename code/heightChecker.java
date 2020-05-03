// https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/

class Solution {
    /*
        n: array length
        time: O(n log n) --> n for loop, n log n for sorting
        space: O(n) --> clones target array
    */
    public int heightChecker(int[] heights) {
        if(heights == null || heights.length < 2) return 0;
        
        int[] target = heights.clone();
        Arrays.sort(target);
        
        int moves = 0;
        for(int i=0; i<heights.length; i++) {
            if(target[i] != heights[i]) moves++;
        }
        
        return moves;
    }
}
