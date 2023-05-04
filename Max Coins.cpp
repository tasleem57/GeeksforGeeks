class Solution{
public:
    int maxCoins(int n,vector<vector<int>> &ranges){
        int ans=0;
        sort(ranges.begin(), ranges.end());
        vector<int>v(n);
        v[n-1]=ranges[n-1][2];
        for(int i=n-2;i>=0;i--) v[i]=max(v[i+1], ranges[i][2]);
        for(int i=0;i<n;i++)
        {
            int x=ranges[i][1];
            int l=i+1;
            int r=n-1;
            int temp=0;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(ranges[mid][0]>=x)
                {
                    temp=max(temp, v[mid]);
                    r=mid-1;
                } else l=mid+1;
            }
            ans=max(temp+ranges[i][2], ans);
        }
        return ans;
    }
};
