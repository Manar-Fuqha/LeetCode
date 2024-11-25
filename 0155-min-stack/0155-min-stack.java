class MinStack {
List<Integer> stack ;
List<Integer> minStack;
int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new ArrayList<>();
        minStack= new ArrayList<>();
    }
    
    public void push(int val) {
        
        if(minStack.isEmpty() || val<=minStack.getFirst()){
            minStack.addFirst(val);
        }
        stack.addFirst(val);
    }
    
    public void pop() {
        if(stack.getFirst().equals(minStack.getFirst())){
            minStack.removeFirst();
        }
     stack.removeFirst();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        return minStack.getFirst();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */