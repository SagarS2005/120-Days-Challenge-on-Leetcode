class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = currentSum;
        }

        
        for (int i = k; i < nums.length; i++) {

            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            
            int outgoing = nums[i - k];
            currentSum -= outgoing;

            map.put(outgoing, map.get(outgoing) - 1);

            if (map.get(outgoing) == 0) {
                map.remove(outgoing);
            }

            if (map.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}