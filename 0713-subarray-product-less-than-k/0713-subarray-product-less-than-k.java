class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if ( k <= 1) return 0;
        int l=0; 
        int product = 1;
        int count = 0;

        for(int r = 0 ; r<nums.length; r++){    // expansion phase of window like ([2], [2,3],[2,3,4])
            product *= nums[r];

            while (product >= k) {        // Shrinking phase of window eg: ( [2,3,4] -> [3,4] , here 2 removed)
                product /= nums[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}