class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int idx=0;
        for(int i=m ; i<a.length; i++){
            a[i] = b[idx++];
        }
        
        Arrays.sort(a);
    }
}