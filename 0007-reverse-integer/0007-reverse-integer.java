class Solution {
    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }

        // If the reversed long value spills out of 32-bit range, return 0
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}
