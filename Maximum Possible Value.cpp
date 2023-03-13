class Solution {
  public:
    long long maxPossibleValue(int N,vector<int> a, vector<int> b) {
        // code here
        long long ans = 0;
        long long  mn =INT_MAX;
        long long ct = 0;
        
        for(int i=0;i<N;i++)
        {
            int d = b[i];
            if(b[i]&1)
            d--;
            ct+=d;
            ans = ans + a[i]*d;
            if(d>=2)
            mn = min({mn,(long long)a[i]});
        }
        if(ct%4!=0)
        ans-= mn*2;
        return ans ;
    }
};
