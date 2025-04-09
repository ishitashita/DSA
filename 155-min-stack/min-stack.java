class MinStack {
    private Stack<pair> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min ;
        if(st.isEmpty()){
            min = val;
        }
        else{
            min = Math.min(val,st.peek().second);

        }
        st.push(new pair(val, min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().first;
   }
    
    public int getMin() {
        return st.peek().second;
    }
    private static class pair{
        int first;
        int second;
        pair(int first, int second){
            this.first = first;
            this.second = second;
        }
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