class Solution{
public:
    int minimumTime(int N,int cur,vector<int> &pos,vector<int> &time){
        int m=INT_MAX;
        for(int i=0;i<N;i++)
        {
            int t=abs(pos[i]-cur);
            m=min(m,t*time[i]);
        }
        return m;
    }
};
