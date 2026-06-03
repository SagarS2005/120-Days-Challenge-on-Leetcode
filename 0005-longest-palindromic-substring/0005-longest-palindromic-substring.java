class Solution {
    public String longestPalindrome(String s) {
        int start=0; 
        int end=0;

        for(int i=0; i<s.length(); i++){
            int l1 = extendedString(s,i,i);         // for odd length string
            int l2 = extendedString(s,i,i+1);       // for even length String
            int length = Math.max(l1, l2);

            if(length > (end-start)){   // tracking maximum length
                start = i - (length-1)/2;
                end = i + length/2;
            }
        }
        return s.substring(start, end + 1);
    }

    static int extendedString(String s, int left, int right){
        while (left >=0 && right <s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right++;
        }
        return right-left-1;
    }
}