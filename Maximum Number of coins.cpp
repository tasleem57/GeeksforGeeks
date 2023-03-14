class Solution{
    public:
         int f(int l,int r,vector <int> &a,vector<vector<int>>&dp)
        {
            int ans = 0;    
            if(dp[l][r]!=-1)
                return dp[l][r];
            for(int i=l+1;i<r;i++)
            {
                ans = max(ans,a[l]*a[i]*a[r] + f(l,i,a,dp) + f(i,r,a,dp));
            }
            return dp[l][r] = ans;
        }
        int maxCoins(int N, vector <int> &a)
        {
            a.insert(a.begin(),1);
            a.push_back(1);
            int n =a.size();
            vector<vector<int>> dp(n,vector<int>(n,-1));
            return f(0,n-1,a,dp);
        }
};
