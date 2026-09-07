class Solution {
   public static boolean backspaceCompare(String s, String t) {
    // Helper method to build the final string result
    String finalS = buildString(s);
    String finalT = buildString(t);
    
    // Simply compare the two final processed strings
    return finalS.equals(finalT);
    }

    private static String buildString(String str) {
        char[] arr = new char[str.length()];
        int writeIndex = 0; // Tracks where the next valid character goes

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '#') {
                // Only backspace if we actually have characters to delete
                if (writeIndex > 0) {
                    writeIndex--; 
                }
            } else {
                // Write character and move our write pointer forward
                arr[writeIndex] = ch;
                writeIndex++;
            }
        }
        
        // Convert only the valid part of the array back to a String
        return new String(arr, 0, writeIndex);
    }

}