class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        
        int n=x;
        int total=0;
        while(n>0){
            int r=n%10;
            total=total*10+r;
            n/=10;
        }
        if(total == x){
            return true;
        }
        return false;
    }
}