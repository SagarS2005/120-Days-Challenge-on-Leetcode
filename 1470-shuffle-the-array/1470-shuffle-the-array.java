class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // Add from 1st half (x)
            result[index++] = nums[i + n]; // Add from 2nd half (y)
        }
        
        return result;
    }
}
