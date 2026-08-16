class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;

        while (right < nums.length) {
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] =temp;
                left ++;
            }
            right ++;
        }

        // int length=nums.length;
        // int left=0; // it will point zeros

        // for(int right=0; right<length; right++){    
        //     if(nums[right]!= 0){       // right will point non-zero element
        //         int temp=nums[right];
        //         nums[right]= nums[left];
        //         nums[left] = temp;
        //         left++;
        //     }
        // }
        
      
    }
}