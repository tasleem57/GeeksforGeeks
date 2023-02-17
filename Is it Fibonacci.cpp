class Solution {
  public:
    long long solve(int N, int K, vector<long long> GeekNum) {
        vector<long long> pre(GeekNum.begin(),GeekNum.end());
        
        long long push = 0;
        
        for(int i = 0; i < K ; i++)
            push += GeekNum[i];

        pre.push_back(push);
        
        int j = 0;
        for(int i = K ; i < N; i++){
            long long val = pre[i]*2 - pre[j++];
            pre.push_back(val);
        }
        return pre[N-1];
    }
};
