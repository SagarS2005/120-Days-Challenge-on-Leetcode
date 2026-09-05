class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;
        int min = Integer.MAX_VALUE;
        int max= 0;

        if(((long)k*m)>n) return -1;

        for(int i =0;i<n ;i++){
             min =Math.min(min,bloomDay[i]);
             max =Math.max(max,bloomDay[i]);
        }

        int low = min;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            if(helper(bloomDay,mid,m,k))
            {
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }

    public boolean helper(int[] bloomDay, int maxbloom, int m, int k) {
        int count =0;
        int ans =0;
        
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=maxbloom) count++;
            else{
                ans = ans + (count/k);
                count=0;
            }
        }
        
        ans = ans + (count/k);
        if(ans >= m) return true;
        return false;
    }
}