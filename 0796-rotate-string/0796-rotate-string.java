class Solution {
    public boolean rotateString(String s, String goal) {
         if(s.length() != goal.length()) return false;
        s += s;
        int n = goal.length();
        for(int i = 0; i < n; i++){
            // System.out.println(s.substring(i, i + n) + " " + goal + "->" + s.substring(i, i + n).equals(goal));
            if(s.substring(i, i + n).equals(goal))
                return true;
        }
        return false;
    }
}