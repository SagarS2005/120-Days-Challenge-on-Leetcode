class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        
        // Find the starting position
        result[0] = findBound(nums, target, true);
        
        // If the target doesn't exist, no need to look for the end position
        if (result[0] != -1) {
            result[1] = findBound(nums, target, false);
        }
        
        return result;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int bound = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                bound = mid; // Record the match candidate
                
                if (isFirst) {
                    end = mid - 1;  // Look left for an even earlier occurrence
                } else {
                    start = mid + 1; // Look right for a later occurrence
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return bound;
    }
}
