class MinStack {
    Stack<Long> st = new Stack<>();
    long min = Long.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int v) {
        long val = (long)(v);
        if(st.isEmpty()){
            st.push(val);
            min = val;
        }
        else if(min > val){
            st.push(2*val - min);
            min = val;
        }
        else{
            st.push(val);
        }
    }
    
    public void pop() {
        long top = st.pop();

        if(min > top){
            min = 2 * min - top;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        long top = st.peek();
        if(top < min) return (int)min;
        else return (int)(top);
    }
    
    public int getMin() {
        return (int)(min);
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