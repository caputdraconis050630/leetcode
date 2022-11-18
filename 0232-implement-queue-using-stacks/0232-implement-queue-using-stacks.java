class MyQueue {
    Stack<Integer> main;
    Stack<Integer> support;
    
    public MyQueue() {
        main = new Stack<Integer>();
        support = new Stack<Integer>();
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while (!main.empty()) {
            support.push(main.pop());
        }
        int ret = support.pop();
        while (!support.empty()) {
            main.push(support.pop());
        }
        return ret;
    }
    
    public int peek() {
        while (!main.empty()) {
            support.push(main.pop());
        }
        int ret = support.peek();
        while (!support.empty()) {
            main.push(support.pop());
        }
        return ret;
    }
    
    public boolean empty() {
        return main.empty();   
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */