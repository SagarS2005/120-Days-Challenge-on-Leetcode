class Solution {
    public int trap(int[] height) {
        int leftB = 0, rightB= 0;
        int left = 0, right = height.length-1;
        int totalWater = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(leftB > height[left]){
                    totalWater += leftB - height[left];
                }
                else{
                    leftB = height[left];
                }
                left++;
            }
            else{
                if(rightB > height[right]){
                    totalWater += rightB - height[right];
                }
                else{
                    rightB = height[right];
                }
                right--;
            }
            
        }
        return totalWater;
    }
}