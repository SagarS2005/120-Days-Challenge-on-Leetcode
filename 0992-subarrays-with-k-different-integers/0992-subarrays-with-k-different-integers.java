class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostSubarray(nums,k) - atMostSubarray(nums,k-1);
    }

    private int atMostSubarray(int[] nums, int k) {
        
        int count =0;
        int left=0;
        Map <Integer, Integer> map = new HashMap<>();
        for(int right = 0; right<nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);

            
            while(map.size() >k){
                // System.out.println(map);
                map.put(nums[left], map.get(nums[left])-1);
                
                if(map.get(nums[left]) ==0){
                    map.remove(nums[left]);
                }
                
                left ++;
            }
            count += right-left+1;

            
        }
        return count;

    }
}