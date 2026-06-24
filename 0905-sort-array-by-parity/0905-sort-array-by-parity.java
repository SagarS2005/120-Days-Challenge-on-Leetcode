class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];

        int even = 0;
        int odd = nums.length - 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){
                result[even] = nums[i];
                even++;
            }else{
                result[odd] = nums[i];
                odd--;
            }
        }

        return result;
    }
}