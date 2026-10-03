class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i= 0, j = 0;
        int max = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                i++;
            }
            else{
                max = Math.max(max, i - j );
                j   = i+1;
                i++;
            }
            
        }
        return Math.max(max, i - j );
    }
}