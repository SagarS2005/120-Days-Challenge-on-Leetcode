class Solution {
    public String restoreString(String s, int[] indices) {
        // Create a character array of the same length as the input string
        char[] shuffled = new char[s.length()];
        
        // Map each character to its target index
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }
        
        // Convert the character array back into a String
        return new String(shuffled);
    }
}
