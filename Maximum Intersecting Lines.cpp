class Solution {
  public:
    int maxIntersections(vector<vector<int>> lines, int N) {
        // Code here
        map<int, int> map;  //create a map
        
       // range query for each range.
        for(auto i: lines) {
            int u = i[0], v = i[1] + 1;
            map[u]++, map[v]--;
        }
        
        int ans = 0, sum = 0;
        
        //prefix sum and maximum value
        for(auto i: map) {
            sum += i.second;
            ans = max(ans, sum);
        }
        
        return ans;
    }
};
