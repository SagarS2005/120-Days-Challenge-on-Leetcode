class Solution {
    public void merge(int[] a, int asize, int[] b, int bsize) {

        int i=a.length-1;
        int j=asize-1;
        int k=bsize-1;

         while(k >= 0 && j >= 0){
            if(a[j] >= b[k]){
                a[i] = a[j];
                j--;
            }
            else {
                a[i] = b[k];
                k--;
            }
            i--;
        }

        while(k >= 0){
            a[i]=b[k];
            i--;
            k--;
        }
    }
}