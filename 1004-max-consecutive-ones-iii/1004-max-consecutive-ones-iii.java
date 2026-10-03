class Solution {
    public int longestOnes(int[] nums, int kCount) {
        int max = 0;
        int j = 0, i = 0;
        while(i < nums.length){
            if ( nums[i] == 0){
                kCount--;
            }
            while(kCount < 0){
                if(nums[j] == 0){
                    kCount++;
                }
                j++;
            }

            max = Math.max(max, i - j +1);
            i++;
        }
        return max;
    }
}