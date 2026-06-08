class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
Map <Integer, Integer> map = new HashMap<>();
        long current_Sum=0;

        for(int i=0; i<k; i++){
            current_Sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        long max= 0;
        if( map.size() == k){
            max = current_Sum;
        }

        for(int j=k; j<nums.length; j++){  
            int removedElemtent = nums[j-k];
            // System.out.println("Removed Element : " + removedElemtent);

            map.put(removedElemtent,map.get(removedElemtent)-1); // if w1=  [2,3,2] , Map : {2:2, 3,1}   After reduce first element // window 2=[3,2] , Map: {3:1, 2:1}
            // System.out.println("After removing  frequency first element : " + map);
            if(map.get(removedElemtent) == 0){
                map.remove(removedElemtent);
                // System.out.println("After removing first element : " + map);
            }


            map.put(nums[j],map.getOrDefault(nums[j], 0)+1);
            current_Sum += nums[j];          
            current_Sum -= nums[j-k];
            if(map.size() == k){
                max = Math.max(max, current_Sum)  ;
            }
        }
        return max;
    }
}