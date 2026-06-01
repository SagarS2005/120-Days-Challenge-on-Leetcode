class Solution {
    static String longestPalindrome(String s) {
        if(s.length() ==1) return s;
        int max=1;
        String result = s.substring(0,1);

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                int length=j-i+1;
                // boolean isPalindrome = isPalindrome(s,i,j);

                if(length> max && s.charAt(i) == s.charAt(j) && isPalindrome(s, i, j)){
                    max =length;
                    result = s.substring(i,j+1);
                }
            }
        }
        return result;

    }

    static boolean isPalindrome(String s, int left, int right){
        while(left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}