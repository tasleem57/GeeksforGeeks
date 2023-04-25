class Solution{
public:
       void precom(vector<int>&v,vector<int>prime){
        for(int i=2;i<=30;i++){
            if((i%4)&&(i%9)&&(i%25)){
                int mask=0;
                for(int j=0;j<10;j++)if(!(i%prime[j]))mask|=(1<<j);
                v[i]=mask;
            }
        }
    }
    int goodSubsets(vector<int> &arr, int n){
        vector<int>v(31,0);
        vector<int>prime={2,3,5,7,11,13,17,19,23,29};
        precom(v,prime);
        const int mod=1e9+7;
        map<int,int>mp;
        long long ans=0;
        vector<long long>dp((1<<10)+1,0);
        int onecnt=0;
        for(auto i:arr){
            if(i==1)onecnt++;
            else mp[i]++;
        }
        dp[0]=1;
        //counting
        for(auto i:mp){
            if(v[i.first]){
                for(int j=0;j<(1<<10);j++){
                    if((v[i.first]&j)==0){
                        dp[j|v[i.first]]+=dp[j]*i.second;
                        dp[j|v[i.first]]%=mod;
                    }
                }
            }
        }
        for(auto i:dp)ans+=i,ans%=mod;
        ans--;
        if(onecnt){
            while(onecnt--){
                ans*=2;
                ans%=mod;
            }
        }
        return ans;
    }
};
