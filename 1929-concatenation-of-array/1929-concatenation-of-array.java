class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // Create array of double size
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];     // Fill the first half
            ans[i + n] = nums[i]; // Fill the second half
        }
        
        return ans;
    }
}
