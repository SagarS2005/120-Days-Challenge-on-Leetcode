class Solution {
    public double myPowHelper(double x, int n) {
        if(n == 1) return x;
        if(n == 0) return 1;

        if(n < 0) {
            if(n == Integer.MIN_VALUE) {
                n = -1 * n;
                return 1 / (x * myPowHelper(x, Integer.MAX_VALUE));
            }

            n = -1 * n;
            return 1 / myPowHelper(x, n);
        }

        double temp = myPowHelper(x, n/2);

        if(n % 2 == 0) return temp * temp;
        return x * temp * temp;
    }
    public double myPow(double x, int n) {
        return myPowHelper(x, n);
    }
}