class Solution {
    public int majorityElement(int[] nums) {
      int majority=0;
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int index=nums[i];
            if (!map.containsKey(index)){
                map.put(index, 1);
            }
            else{
                map.put(index, map.get(index)+1);
            }
        }

         for(int key : map.keySet()){
            if(majority == 0)
            majority=map.get(key)>majority? key: majority;
            else majority = map.get(key)>map.get(majority)? key: majority;
        }
        return majority;
    }
}