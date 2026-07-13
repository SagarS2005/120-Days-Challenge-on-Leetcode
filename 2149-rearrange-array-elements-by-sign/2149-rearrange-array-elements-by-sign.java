class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int n = nums.length-1;
        // List <Integer> positive = new ArrayList<>();
        // List <Integer> negative = new ArrayList<>();

        // for(int i=0; i<= n; i++){
        //     if( nums[i] >= 0){
        //         positive.add(nums[i]);
        //     }
        //     else{
        //         negative.add(nums[i]);
        //     }
        // }
       
        // for( int i = 0; i <= n/2 ; i++){
        //     nums[2*i] = positive.get(i);
        //     nums[2*i + 1] = negative.get(i);
        // }

        // return nums;

        int positive = 0, negative = 1;
        int res [] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if ( nums[i] > 0) {
                res[positive] =  nums[i];
                positive += 2;
            }
            else{
                res[negative] = nums[i];
                negative +=2;
            }
        }
        return res;
    }
}