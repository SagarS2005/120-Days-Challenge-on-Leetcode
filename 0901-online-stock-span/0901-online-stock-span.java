// Java
import java.util.Stack;

class StockSpanner {
    // private Stack<int[]> stack;

    // public StockSpanner() {
    //     stack = new Stack<>();
    // }

    // public int next(int price) {
    //     int span = 1;
    //     while (!stack.isEmpty() && stack.peek()[0] <= price) {
    //         span += stack.pop()[1]; // Add popped span
    //     }
    //     stack.push(new int[]{price, span}); // Store price and span
    //     return span;
    // }

    private static int[] price = new int[20];
    private static int[] span = new int[20];
    int top = -1;

    public int next(int pr) {
      int sp = 1;

      while (top != -1 && price[top] <= pr) {
        sp += span[top--];
      }
      price[++top] = pr;
      span[top] = sp;
      return sp;
    }
}