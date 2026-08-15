class Solution {
    public boolean isIsomorphic(String s, String t) {
        // ASCII character limit is 256
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // Check if current positions match previous mappings
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            
            // Store the next index position (i + 1) to handle default 0 value
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}
