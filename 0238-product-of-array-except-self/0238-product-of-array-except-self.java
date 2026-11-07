class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []lp =new int[nums.length];
        int []rp =new int[nums.length];

        lp [0] = nums[0];
        for(int i = 1; i< nums.length; i++){
            lp[i] =  nums[i] * lp[i-1];
        }

        rp[nums.length-1] = nums[nums.length-1];
        for(int j = nums.length-2 ; j>= 0; j--){
            rp[j] = rp[j+1]* nums[j];
        }

        int right = 1;
        int ans[] = new int[nums.length];

        for(int i= nums.length-1; i> 0; i--){
            ans[i] = right * lp[i-1];
            right = rp[i];
        }
        ans[0] = right;

        return ans;
    }
}