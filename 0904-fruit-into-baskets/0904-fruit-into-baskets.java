class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int l=0;
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int r=0; r<fruits.length; r++){
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);

            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);

                if(map.get(fruits[l]) <1){
                    map.remove(fruits[l]);
                }
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
// class Solution {
//     public int totalFruit(int[] nums) {
//         int max=0;
//         // for(int l=0; l<nums.length; l++){
//         //     int b1 = Integer.MIN_VALUE , b2=Integer.MIN_VALUE;
//         //     int count=0;
//         //     for(int r=l ; r<nums.length; r++){
//         //         if(b1 == Integer.MIN_VALUE) b1 = nums[r];
//         //         else if (b2 == Integer.MIN_VALUE && nums[r] != b1) {
//         //             b2 = nums[r];
//         //         }
                
//         //         if( b1 == nums[r] || b2 == nums[r]){
//         //             count++;
//         //         }
//         //         else{
                    
//         //             break;
//         //         }
                
//         //     }
//         //     max = Math.max(max, count);
//         // }

            // Another Solution
//         int l=0; int r=0;
//         int b1 = Integer.MIN_VALUE , b2=Integer.MIN_VALUE;
//         int count=0;
//         while(r<nums.length){
//            if(b1 == Integer.MIN_VALUE) b1 = nums[r];
//             else if (b2 == Integer.MIN_VALUE && nums[r] != b1) {
//                b2 = nums[r];
//             }

//             if(b1 == nums[r] || b2 == nums[r]){
//                 count = r-l+1;
//             }
//             else{
//                 l=r-1;
//                 b1 = b2;
//                 b2 = nums[r];
        
//             }
//             max = Math.max(max, count);
//             r++;
        
//         }
//         return max;
//     }
// }