class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // -4, -1, -1, 0, 1, 2 

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){   // if last == present then 
                continue;
            }

            int start = i + 1;
            int end = nums.length-1;

            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    result.add(list);

                    while(start < end && nums[start] == nums[start+1]) start++;
                    while(start < end && nums[end] == nums[end-1]) end--;

                    start++;
                    end--;
                }

                else if(sum > 0) end--; // focus if i don't write else if then it won't work
                else start++;
            }
        }
        return result;

        
    }
}