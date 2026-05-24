class Solution {
    public void moveZeroes(int[] nums) {
        int length=nums.length;
        int left=0; // it will point zeros

        for(int right=0; right<length; right++){    
            if(nums[right]!= 0){       // right will point non-zero element
                int temp=nums[right];
                nums[right]= nums[left];
                nums[left] = temp;
                left++;
            }
        }
        
      
    }
}