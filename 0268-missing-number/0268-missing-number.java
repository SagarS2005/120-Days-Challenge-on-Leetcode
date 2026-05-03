class Solution {
    public int missingNumber(int[] nums) {
        int max=0;
       int total_original=0;
        for(int i:nums){
            max=Integer.max(i, max);
            total_original = total_original + i;
        }
       
      int length=nums.length;
       // total length with missing number
       int totalOfNewArray=(length*(length+1))/2; 

       return totalOfNewArray-total_original;
    }
}