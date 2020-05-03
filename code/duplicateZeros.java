// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/

class Solution {
    /*
        n: array length
        time: O(n) -- first pass calculate last index that fits in the array, 
            second pass fill up the array backwards in place
        smape: O(1)
    */
    public void duplicateZeros(int[] arr) {
        
        int lastIndex = 0, count = 0;
        boolean isLastZeroOverflows = false;
        while(count < arr.length) {
            if(arr[lastIndex++] == 0) count += 2;
            else count++;
            
            if(count > arr.length) isLastZeroOverflows = true;
        }
        lastIndex -= 1;
        
        int rightIndex = arr.length-1;
        
        if(isLastZeroOverflows) {
            arr[rightIndex--] = 0;
            lastIndex--;
        }
        
        while(lastIndex >= 0) {
            if(arr[lastIndex] == 0) {
                if(rightIndex >= 0) arr[rightIndex--] = 0;
            }
            
            if(rightIndex >= 0) arr[rightIndex--] = arr[lastIndex];
            lastIndex--;
        }
    }
    
}
