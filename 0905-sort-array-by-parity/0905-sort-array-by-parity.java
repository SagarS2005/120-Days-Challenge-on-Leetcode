class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];

        int e = 0;
        int o = nums.length - 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] % 2 == 0){
                result[e] = nums[i];
                e++;
            }else{
                result[o] = nums[i];
                o--;
            }
        }

        return result;
    }
}