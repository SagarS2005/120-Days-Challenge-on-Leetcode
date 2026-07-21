class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            // Check if the middle character is '+'
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
