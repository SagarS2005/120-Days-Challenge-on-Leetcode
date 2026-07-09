class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result [] = new int[nums.length];
        result[0] = 1;
        // result array will store element from the left side of current index's element 
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        // Here result array will store elements from the right side of nums array 
        for(int r = nums.length-1; r >= 0; r--){
            result[r] = result[r] * rightProduct;
            rightProduct *= nums[r];
        }
        return result;
    }
}
