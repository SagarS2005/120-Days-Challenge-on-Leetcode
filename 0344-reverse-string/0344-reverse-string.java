class Solution {
    public void reverseString(char[] s) {
        int lastIndex = s.length-1;
        for(int i=0; i<s.length/2; i++){
            char temp = s[lastIndex];
            s[lastIndex] = s[i];
            s[i] = temp;
            lastIndex--;
        }
    }
}