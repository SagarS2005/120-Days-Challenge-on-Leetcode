class Solution {
    public int majorityElement(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i] , map.get(nums[i])+1);
            }
        };

        int majority = 0;
        int maxCount = 0;
        
        for(int key:map.keySet()){
            if (map.get(key) > maxCount) {
            maxCount = map.get(key); // Save the highest count seen
            majority = key;          // Save the actual element
        }
            
        }
        return majority;
    }
}