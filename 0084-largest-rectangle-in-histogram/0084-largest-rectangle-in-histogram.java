import java.util.*;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i <= heights.length; i++) {

            int currHeight = (i == heights.length) ? 0 : heights[i];

            while(!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int right = i;
                int height = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;
                int area = height * width;
                result = Math.max(result, area);
            }
            if(i < heights.length) stack.push(i);
        }
        return result;
    }
}