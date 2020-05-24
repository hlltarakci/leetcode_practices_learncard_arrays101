// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

class Solution {
    /*
        n: num on numbers
        k: num of digits on max num
        time: O(n k)
        space: O(1)
    */
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if( isEvenNumOfDigits(num) ) count++;
        }
        
        return count;
    }
    
    private boolean isEvenNumOfDigits(int n) {
        int sum = 0;
        while(n > 0) {
            sum++;
            n /= 10;
        }
        
        return sum % 2 == 0;
    }
}
