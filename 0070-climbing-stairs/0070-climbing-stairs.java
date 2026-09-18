class Solution {
    public int climbStairs(int n) {

        // Recursion
        // if(n <= 2)
        // return n;

        // return climbStairs(n-1) + climbStairs(n-2);


        /*  climbStairs(n-1) : to reach nth step what can the last step
            climbStairs(n-2) : to reach nth step what can the last step will be n-2
        */


        
        // Dynamic Programming

        if(n <=2) return n;
        int prev = 1;
        int prev1 = 2;

        for(int i = 3 ; i <= n; i++){
            int temp = prev + prev1;
            prev = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}