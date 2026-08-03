class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;

        while (start < end) {
            // int mid = start + (end - start )/2;
            // if(nums[mid] > nums[mid+1]){
            //     end = mid;
            // }
            // else {
            //     start = mid + 1;
            // }
            int mid = start + (end - start +1)/2;   // for taking mid as mid + 1;
            if(nums[mid] > nums[mid - 1]){
                start = mid ;
            }
            else {
                end = mid - 1 ;
            }
        }
        return start;
    }
}