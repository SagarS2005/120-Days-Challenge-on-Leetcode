class MyStack {
    Queue<Integer> queue ;
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        int size = queue.size();

        for(int i = 0; i< size-1; i++){
            queue.add(queue.remove());  // removing last added element and adding into front of queue
        }   
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
       return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

