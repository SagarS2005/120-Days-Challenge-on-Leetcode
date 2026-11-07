class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int countSubArray = 0;
        for(int i : nums){
            sum += i;
            int val = sum - k;

            if(map.containsKey(val)){
                countSubArray += map.get(val);
            }

            map.put(sum, map.getOrDefault(sum, 0 )+1);
        }
        return countSubArray;
    }
}