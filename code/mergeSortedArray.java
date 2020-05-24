// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/

class Solution {
    /*
        n, m: array lengths
        time: O(n + m)
        space: O(1)
    */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1, i1 = m-1, i2 = n-1;
        while(lastIndex >= 0) {
            int val1 = i1 >= 0 ? nums1[i1] : Integer.MIN_VALUE;
            int val2 = i2 >= 0 ? nums2[i2] : Integer.MIN_VALUE;
            
            if(val1 > val2) {
                nums1[lastIndex--] = val1;
                i1--;
            } else {
                nums1[lastIndex--] = val2;
                i2--;
            }
        }
    }
}
