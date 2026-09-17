class Solution {
    public double myPow(double x, int n) {
        long exp = n;

        if(exp < 0){
            x = 1/x;
            exp = -exp;
        }

        // double ans = 1;
        // while(exp > 0){
        //     if(exp % 2 != 0){
        //         ans *= x;
        //     }

        //     x*=x;
        //     exp  /=2;
        
        // }

        // return ans;


        return power(x, exp, 1);
    }


    private double power(double  x, long exp, double ans){
        if(exp == 0){
            return ans;
        }
        
        if(exp % 2 != 0){
            ans *= x;
        }
        return power(x*x, exp/2, ans);
    }
}