class MinStack {

    Stack<Integer> stack ;
    Stack<Integer> min_Stack;
    public MinStack() {
        stack = new Stack<>();
        min_Stack  = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(min_Stack.isEmpty()){
            min_Stack.push(value);
        }
        else{
           min_Stack.push(Math.min(value, min_Stack.peek())); 
        }
    }
    
    public void pop() {
        if(stack.isEmpty()){
            return ;
        }
        stack.pop();
        min_Stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_Stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */