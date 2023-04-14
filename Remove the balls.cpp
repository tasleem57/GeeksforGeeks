class Solution {
  public:
    int finLength(int n, vector<int> color, vector<int> radius) {
        
        if(n == 1 || n == 0) 
        return n;
    stack<int> st; 
    for(int i = 0; i < n; i++) 
    {
        if(st.empty() || color[st.top()] != color[i] || radius[st.top()] != radius[i])
            st.push(i);
        else 
            st.pop();
    }    
    return st.size(); 
}
    
};
