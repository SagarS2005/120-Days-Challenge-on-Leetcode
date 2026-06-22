class Solution {
    public boolean check(int[] a) {

        int firstIndex=Integer.MIN_VALUE;
        int length=a.length;
        int count=0;

        for(int i=0; i<length; i++){
            if(a[i]>a[(i+1) % length]){
                firstIndex =i+1;
                count++;    // it track that only one time greater value is written before  smaller value if array is rotated
            } 
        }
        if(count>1){
            return false;
        }
        return true;
    }
}