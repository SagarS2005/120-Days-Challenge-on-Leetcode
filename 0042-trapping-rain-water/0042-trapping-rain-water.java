class Solution {
    public int trap(int[] height) {
        int leftMax = 0 ;
        int rightMax = 0;

        int left = 0;
        int right = height.length-1;
        int totalWater = 0;

        while (left <= right){
            
            if (height[left] < height[right]){
                
                if(leftMax > height[left]){
                    totalWater += leftMax - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if( rightMax > height[right]){
                    totalWater += rightMax - height[right];
                }
                else rightMax = height[right];
                right--;
            }
        }
        return totalWater;
    }
}