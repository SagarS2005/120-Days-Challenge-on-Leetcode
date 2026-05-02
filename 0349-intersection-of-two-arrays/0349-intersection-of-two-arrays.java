class Solution {
    public int[] intersection(int[] a, int[] b) {
      Set<Integer> set =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();
        int length=b.length;
        for (int i:a){
            set.add(i);
        }
        int i=0;
        while(i<length){
            if(set.contains(b[i])){
                set2.add(b[i]);
            }
            i++;

        }
        int [] res= new int[set2.size()];
        i=0;
        for(int j:set2){
            res[i]=j;
            i++;
        }
        System.out.println(set2);
        return res;
    }
}