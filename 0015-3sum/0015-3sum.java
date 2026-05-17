class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        List <List<Integer>> list = new ArrayList<>();
        

        for( int start=0; start<a.length-2; start++){
            if(start>0 && a[start] == a[start-1]) continue;
            int find=start+1;
            int end=a.length-1;
            while(find<end){
                int sum = a[start]+a[find]+a[end];
                if(sum  == 0 ) {
                    List <Integer> li= new ArrayList<>(Arrays.asList(a[start],a[find],a[end]));
                
                    list.add(li);  
                    while(find < end && a[find] == a[find+1]) find++;
                    while(find < end && a[end] == a[end-1]) end--;

                find++;
                end--;
                }
                else if(sum  > 0){
                    end--;
                }
                else{
                    find++;
                }
            }
        }
        return list;       
    }
}