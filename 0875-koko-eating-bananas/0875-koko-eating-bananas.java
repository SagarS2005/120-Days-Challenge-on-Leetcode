class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // we have to return minimum speed means how much banana she will eat per hour to finish all the banana

        int minSpeed = 1, maxSpeed = 0 ;
        for(int p : piles){
            maxSpeed = Math.max(p, maxSpeed);
        }

        int ans = maxSpeed; 
        while(minSpeed <= maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if(canEat(piles, h, mid)){
                ans = mid;
                maxSpeed = mid - 1;
            }
            else{
                minSpeed = mid + 1;
            }
        }
        return ans;
    }

    private boolean canEat(int [] piles, int h, int k){
        long hours = 0;
        for(int p : piles){
            hours += (p + k - 1) / k;   // to get a ceiling value because if piles > k than she have to take that hours completely even if piles have been eaten completely
        }
        return hours <= h;
    }
}