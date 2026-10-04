class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1) return 0;
        int count = 0;
        int product = 1;
        int i = 0, j = 0;
        while(i < nums.length){
            product *= nums[i];
            while(product >= k){
                product /= nums[j++];
            }
            count += i - j +1;
            i++;
        }
        return count;
    }
}