class Solution {
    public int subarraySum(int[] a, int key) {
        int n=0;
        int count=0;
        for(int i=0; i<a.length; i++){
            int sum=0;
            for(int j=i; j<a.length; j++){
                sum= sum+a[j];
                if (sum ==key) count++;
            }
        }
        return count;
    }
}
