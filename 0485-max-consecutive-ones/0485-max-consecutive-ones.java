class Solution {
    static int findMaxConsecutiveOnes(int[] nums) {
       int i=0; 
      
       int count=0;
       int max=0;
        while( i< nums.length) {
            
            if(nums[i]==1){
                count++;
               
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
            i++;
        }
        return Math.max(max,count);
    }
}