class Solution {
    public int subarraySum(int[] a, int key) {
        int n=0;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1; i<a.length; i++){  // Calculating Prefix
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0; i<a.length; i++){ 
            int sum=0; int curr=0;
            for(int j=i; j<a.length; j++){
                sum = i==0? prefix[j]: prefix[j] - prefix[i-1];
                if(sum==key){
                    n++;
                }
            }
        }
        return n;
    }
}
