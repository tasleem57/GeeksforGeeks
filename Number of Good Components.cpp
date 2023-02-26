class Solution {
  public:
    
    void dfs(vector<int> &visited, vector<vector<int>>& adj, int i, int &count)
    {
        visited[i]=1;
        count++;
        for(auto x : adj[i])
        {
            if(visited[x]==0)
            dfs(visited,adj,x,count);
        }
        
    }
    
    int findNumberOfGoodComponent(int V, vector<vector<int>>& adj) 
    {
        int ans = 0;
        vector<int> visited(V+1,0);
        
        for(int i=1; i<=V; i++)
        {
            int count = 0;
            if(visited[i]==0)
            dfs(visited,adj,i,count);
            
            if(count!=0)
            {
                int count1 = 0;
                for(int i=1; i<=V; i++)
                {
                    if(visited[i]==1)
                    {
                        visited[i]=2;
                        if(adj[i].size()==count-1)
                        count1++;
                     }
                }
                if(count1 == count)
                ans++;
            }
        }
        return ans;
        
    }
};
