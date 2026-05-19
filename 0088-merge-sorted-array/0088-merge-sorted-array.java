class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int idx=0;
        for(int i=m ; i<a.length; i++){
            a[i] = b[idx++];
        }
        
       for(int i =1; i<a.length; i++){
                int sortedArray=i-1;
                int temp=a[i];
                while (  sortedArray>=0 && a[sortedArray] >temp ) {
                    a[sortedArray+1] =a[sortedArray];
                    sortedArray--;
                }
                a[sortedArray+1] =temp;
        }
    }
}