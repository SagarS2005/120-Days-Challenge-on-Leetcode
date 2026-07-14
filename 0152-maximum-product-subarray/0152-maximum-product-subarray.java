class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 - i]; // Scan from the back
            
            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
            
            
            if (leftProduct == 0) leftProduct = 1;
            if (rightProduct == 0) rightProduct = 1;
        }
        
        return maxProduct;
    }
}