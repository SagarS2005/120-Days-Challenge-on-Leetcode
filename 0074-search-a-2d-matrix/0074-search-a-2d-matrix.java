class Solution {
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int i = 0; i < matrix.length ; i ++){
    //         int start = matrix[i][0];
    //         int end = matrix[i][matrix[i].length-1];
    //         boolean ans=false;
    //         if(start <= target && target <= end){
    //             return bs(matrix[i], target);
    //         }
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, end = matrix.length-1;
        while (start <= end){
            int mid = start + (end - start) /2;

            if(matrix[mid][matrix[mid].length-1] < target) {
                start = mid +1;
            }
            else{
                if(matrix[mid][matrix[mid].length-1] >= target &&  target >=matrix[mid][0]  ){
                    return bs(matrix[mid], target);
                }
                else{
                    end = mid - 1;
                }
            }
            
        }
        return false;
    }

    private boolean bs(int []nums, int target){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target) return true;

            else if(nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
}