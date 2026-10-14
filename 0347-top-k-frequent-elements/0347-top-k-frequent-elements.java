// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i: nums){
//             map.put(i, map.getOrDefault(i,0)+1);
//         }
//         int i = 0;
//         for(int key : map.keySet()){
//             i++;
//         }

//         int size = nums.length;
//         int min_freq = size /i;
//         List<Integer> list = new ArrayList<>();

//         for(int key : map.keySet()){
//             int freq = map.get(key);
//             if(min_freq <= freq ){
//                 for(int i: listsi)
//                 list.add(key);
//             }
//         }
//          int[] arr = new int[list.size()];
//         for (int j = 0; j < list.size(); j++) {
//             arr[j] = list.get(j); // Auto-unboxing converts Integer to primitive int
//         } 
//         return arr;


//     }
// }




class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create buckets where index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Collect the top K elements by scanning buckets from right to left
        List<Integer> res = new ArrayList<>();
        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }

        // Your exact correct conversion code from ArrayList to int[]
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            result[j] = res.get(j);
        }

        return result;
    }
}
